package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import com.amazonaws.mws.model.SubmitFeedResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmissionResultConnector;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmitFeedConnector;
import pl.com.infratex.ordermanager.service.csv.shipment.confirmation.ShipmentConfirmationCsvProcessor;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.coverter.ShipmentConfirmationModelConverter;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

@Service
public class ShipmentConfirmationManagerService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationManagerService.class.getName());

    private final ENadawcaService eNadawcaService;
    private final OrderService orderService;
    private final ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    //    private final AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor;
    private final AmazonSubmitFeedConnector amazonSubmitFeedConnector;
    private final ShipmentConfirmationModelConverter shipmentConfirmationModelConverter;
    private final AmazonSubmissionResultConnector amazonSubmissionResultConnector;

    public ShipmentConfirmationManagerService(ENadawcaService eNadawcaService, OrderService orderService,
                                              ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor,
//                                              AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor,
                                              AmazonSubmitFeedConnector amazonSubmitFeedConnector,
                                              ShipmentConfirmationModelConverter shipmentConfirmationModelConverter, AmazonSubmissionResultConnector amazonSubmissionResultConnector) {
        this.eNadawcaService = eNadawcaService;
        this.orderService = orderService;
        this.shipmentConfirmationCsvProcessor = shipmentConfirmationCsvProcessor;
//        this.amazonCsvSubmissionResultProcessor = amazonCsvSubmissionResultProcessor;
        this.amazonSubmitFeedConnector = amazonSubmitFeedConnector;
        this.shipmentConfirmationModelConverter = shipmentConfirmationModelConverter;
        this.amazonSubmissionResultConnector = amazonSubmissionResultConnector;
    }

    public void confirmShipment() {
        LOGGER.info("confirmShipment()");
        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();
        try {
            shipmentConfirmationModels = eNadawcaService.checkStatus(LocalDateTime.now());
            InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
            SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
            String feedSubmissionId = submitFeedResponse.getSubmitFeedResult().getFeedSubmissionInfo().getFeedSubmissionId();
            String submitFeedResponseJSON = submitFeedResponse.toJSON();
            LOGGER.info("submitFeedResponseJSON: " + submitFeedResponseJSON);

            List<OrderModel> orderModels = shipmentConfirmationModelConverter.from(shipmentConfirmationModels);
            LOGGER.info("#### BEFORE CALLABLE");
            // FIXME: uncomment!!!
            checkShipment(feedSubmissionId);
            LOGGER.info("#### AFTER CALLABLE");
            //orderService.updateOrderStatus(orderModels, OrderStatusType.SENT);
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
        }
    }

    class FeedSubmissionResultCallable implements Callable<String> {
        private final String feedSubmissionId;

        public FeedSubmissionResultCallable(String feedSubmissionId) {
            this.feedSubmissionId = feedSubmissionId;
        }

        @Override
        public String call() throws Exception {
            System.out.println("#### CALL FeedSubmissionResultCallable");
            try {
                GetFeedSubmissionResultResponse getFeedSubmissionResultResponse =
                        amazonSubmissionResultConnector.feedSubmissionResult(feedSubmissionId);
                LOGGER.info("#### getFeedSubmissionResultResponse: " + getFeedSubmissionResultResponse);
            } catch (MarketplaceWebServiceException ex) {
                System.out.println("Caught Exception: " + ex.getMessage());
//                System.out.println("Response Status Code: " + ex.getStatusCode());
//                System.out.println("Error Code: " + ex.getErrorCode());
//                System.out.println("Error Type: " + ex.getErrorType());
//                System.out.println("Request ID: " + ex.getRequestId());
//                System.out.print("XML: " + ex.getXML());
//                System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            }
            return "AMZ OK!";
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

//            while (count <= tries || result != null) {
            while (count <= tries) {
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

    public void checkShipment(String feedSubmissionId) throws ExecutionException, InterruptedException {
        /*
        Callable<String> getFeedSubmissionResultCallable = () -> {
            System.out.println("getFeedSubmissionResultCallable");
            try {
//                Thread.sleep(5000);
                GetFeedSubmissionResultResponse getFeedSubmissionResultResponse =
                        amazonSubmissionResultConnector.feedSubmissionResult(feedSubmissionId);
                LOGGER.info("#### getFeedSubmissionResultResponse: " + getFeedSubmissionResultResponse);
            } catch (MarketplaceWebServiceException ex) {
                System.out.println("Caught Exception: " + ex.getMessage());
                System.out.println("Response Status Code: " + ex.getStatusCode());
                System.out.println("Error Code: " + ex.getErrorCode());
                System.out.println("Error Type: " + ex.getErrorType());
                System.out.println("Request ID: " + ex.getRequestId());
                System.out.print("XML: " + ex.getXML());
                System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            }
            return "AMZ OK!";
        };
        */
        //        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<String> futureResultString = executorService.submit(getFeedSubmissionResultCallable);
//        executorService.shutdown();
//        String resultString = futureResultString.get();

//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setCorePoolSize(2);
//        threadPoolTaskExecutor.setMaxPoolSize(2);
//        threadPoolTaskExecutor.initialize();

        FeedSubmissionResultCallable callable = new FeedSubmissionResultCallable(feedSubmissionId);
//        Future<String> stringFuture = threadPoolTaskExecutor.submit(callable);

        RetryHelper<String> retryHelper = new RetryHelper<>(3, 3000, callable);
        retryHelper.retry();

//        LOGGER.info("#### stringFuture: " + stringFuture);
//        String resultString = stringFuture.get();
//        LOGGER.info("#### resultString " + resultString);
//        threadPoolTaskExecutor.shutdown();
    }

}
