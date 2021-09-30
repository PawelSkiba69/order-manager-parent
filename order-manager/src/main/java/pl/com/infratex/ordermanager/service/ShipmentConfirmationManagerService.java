package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.SubmitFeedResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.amazon.csv.AmazonSubmissionResult;
import pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmissionResultConnector;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmitFeedConnector;
import pl.com.infratex.ordermanager.service.csv.shipment.confirmation.ShipmentConfirmationCsvProcessor;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ShipmentConfirmationReportModel;
import pl.com.infratex.ordermanager.web.model.coverter.ShipmentConfirmationModelConverter;
import pl.com.infratex.ordermanager.web.model.coverter.ShipmentConfirmationReportConverter;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

@Service
public class ShipmentConfirmationManagerService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationManagerService.class.getName());
    public static final String SUBMISSION_RESULT_TYPE_ERROR_ERROR = "Error";

    private final ENadawcaService eNadawcaService;
    private final OrderService orderService;
    private final ShipmentConfirmationReportService shipmentConfirmationReportService;
    private final ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    private final AmazonSubmissionResultConnector amazonSubmissionResultConnector;
    private final AmazonSubmitFeedConnector amazonSubmitFeedConnector;
    private final ShipmentConfirmationModelConverter shipmentConfirmationModelConverter;
    private final ShipmentConfirmationReportConverter shipmentConfirmationReportConverter;

    public ShipmentConfirmationManagerService(ENadawcaService eNadawcaService, OrderService orderService, ShipmentConfirmationReportService shipmentConfirmationReportService, ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor, AmazonSubmissionResultConnector amazonSubmissionResultConnector, AmazonSubmitFeedConnector amazonSubmitFeedConnector, ShipmentConfirmationModelConverter shipmentConfirmationModelConverter, ShipmentConfirmationReportConverter shipmentConfirmationReportConverter) {
        this.eNadawcaService = eNadawcaService;
        this.orderService = orderService;
        this.shipmentConfirmationReportService = shipmentConfirmationReportService;
        this.shipmentConfirmationCsvProcessor = shipmentConfirmationCsvProcessor;
        this.amazonSubmissionResultConnector = amazonSubmissionResultConnector;
        this.amazonSubmitFeedConnector = amazonSubmitFeedConnector;
        this.shipmentConfirmationModelConverter = shipmentConfirmationModelConverter;
        this.shipmentConfirmationReportConverter = shipmentConfirmationReportConverter;
    }

    public void confirmShipment() {
        LOGGER.info("confirmShipment()");
//        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();
        try {
            LocalDateTime loadDate = LocalDateTime.now();
            List<ShipmentConfirmationModel> shipmentConfirmationModels = eNadawcaService.checkStatus(loadDate);
            if (shipmentConfirmationModels != null && shipmentConfirmationModels.size() > 0) {
                InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
                SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
                String feedSubmissionId = submitFeedResponse.getSubmitFeedResult().getFeedSubmissionInfo().getFeedSubmissionId();
                String submitFeedResponseJSON = submitFeedResponse.toJSON();
                LOGGER.info("submitFeedResponseJSON: " + submitFeedResponseJSON);

                List<OrderModel> orders = shipmentConfirmationModelConverter.from(shipmentConfirmationModels);
                LOGGER.info("#### BEFORE CALLABLE");
                AmazonSubmissionResult amazonSubmissionResult = checkShipment(feedSubmissionId);

                LOGGER.info("#### amazonSubmissionResult: " + amazonSubmissionResult);
                if (amazonSubmissionResult != null) {
                    List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels =
                            amazonSubmissionResult.getAmazonCsvSubmissionResultModels();
                    LOGGER.info("#### amazonSubmissionResult: " + amazonCsvSubmissionResultModels);
                    LOGGER.info("#### AFTER CALLABLE");

                    List<OrderModel> ordersWithConfirmError = filterShipments(amazonCsvSubmissionResultModels, orders);
                    orderService.updateOrderStatus(orders, OrderStatusType.SHIPPED_AMAZON);
                    orderService.updateOrderStatus(ordersWithConfirmError, OrderStatusType.SHIP_CONFIRM_ERROR);

                    ShipmentConfirmationReportModel shipmentConfirmationReportModel =
                            shipmentConfirmationReportConverter.convert(loadDate, orders.size(), ordersWithConfirmError.size());

                    shipmentConfirmationReportService.save(shipmentConfirmationReportModel);
                }
            }
        } catch (ShipmentConfirmationCsvProcessorException e) {
            e.printStackTrace();
            //TODO zastanowić się co z tym zrobić
//        } catch (OrderNotFoundException e) {
//            e.printStackTrace();
            //TODO zastanowić się co z tym zrobić
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (OrderNotFoundException e) {
            LOGGER.warning(e.getMessage());
        }
    }

    List<OrderModel> filterShipments(List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResults, List<OrderModel> orders) {

        List<OrderModel> ordersWithConfirmError = new ArrayList<>();

        for (AmazonCsvSubmissionResultModel result : amazonCsvSubmissionResults) {
            LOGGER.info("amazonCsvSubmissionResults: " + amazonCsvSubmissionResults);
            LOGGER.info("orders: " + orders);
            String errorType = result.getErrorType();
            if (errorType.equals(SUBMISSION_RESULT_TYPE_ERROR_ERROR)) {
                String orderIdWithError = result.getOrderId();
                Iterator<OrderModel> iterator = orders.iterator();
                while (iterator.hasNext()) {
                    OrderModel orderModel = iterator.next();
                    String orderId = orderModel.getOrderId();
                    if (orderId.equals(orderIdWithError)) {
                        ordersWithConfirmError.add(orderModel);
                        iterator.remove();
                    }
                }
            }
        }
        LOGGER.info("orders: " + orders);
        LOGGER.info("orders with error: " + ordersWithConfirmError);

        return ordersWithConfirmError;
    }

    class FeedSubmissionResultCallable implements Callable<AmazonSubmissionResult> {
        private final String feedSubmissionId;

        public FeedSubmissionResultCallable(String feedSubmissionId) {
            this.feedSubmissionId = feedSubmissionId;
        }

        @Override
        public AmazonSubmissionResult call() throws Exception {
            LOGGER.info("#### CALL FeedSubmissionResultCallable");
            try {
//                GetFeedSubmissionResultResponse getFeedSubmissionResultResponse =
                AmazonSubmissionResult amazonSubmissionResult = amazonSubmissionResultConnector.feedSubmissionResult(feedSubmissionId);
                LOGGER.info("#### amazonSubmissionResult: " + amazonSubmissionResult);
                return amazonSubmissionResult;
            } catch (MarketplaceWebServiceException ex) {
                System.out.println("Caught Exception: " + ex.getMessage());
//                System.out.println("Response Status Code: " + ex.getStatusCode());
//                System.out.println("Error Code: " + ex.getErrorCode());
//                System.out.println("Error Type: " + ex.getErrorType());
//                System.out.println("Request ID: " + ex.getRequestId());
//                System.out.print("XML: " + ex.getXML());
//                System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            }
            return null;
        }
    }

    class RetryHelper<T> {
        private final int tries;
        private final long delay;
        private final Callable<T> callable;

        public RetryHelper(int tries, long delay, Callable<T> callable) {
            this.tries = tries;
            this.delay = delay;
            this.callable = callable;
        }

        public T retry() {
            T result = null;
            int count = 0;

            while (result == null) {
                try {
                    result = callable.call();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                count++;
                LOGGER.info("Waiting...");
                try {
                    Thread.sleep(delay * count);
                } catch (InterruptedException e) {
                    // do nothing...
                }
            }

            return result;
        }
    }

    public AmazonSubmissionResult checkShipment(String feedSubmissionId) throws ExecutionException, InterruptedException {
        FeedSubmissionResultCallable callable = new FeedSubmissionResultCallable(feedSubmissionId);

        RetryHelper<AmazonSubmissionResult> retryHelper = new RetryHelper<>(3, 3000, callable);
        return retryHelper.retry();
    }

}
