package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.model.SubmitFeedResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

@Service
public class ShipmentConfirmationManagerService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationManagerService.class.getName());

    private ENadawcaService eNadawcaService;
    private OrderService orderService;
    private ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    private AmazonSubmitFeedConnector amazonSubmitFeedConnector;
    private ShipmentConfirmationModelConverter shipmentConfirmationModelConverter;

    public ShipmentConfirmationManagerService(ENadawcaService eNadawcaService, OrderService orderService, ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor, AmazonSubmitFeedConnector amazonSubmitFeedConnector, ShipmentConfirmationModelConverter shipmentConfirmationModelConverter) {
        this.eNadawcaService = eNadawcaService;
        this.orderService = orderService;
        this.shipmentConfirmationCsvProcessor = shipmentConfirmationCsvProcessor;
        this.amazonSubmitFeedConnector = amazonSubmitFeedConnector;
        this.shipmentConfirmationModelConverter = shipmentConfirmationModelConverter;
    }

    public void confirmShipment() {
        LOGGER.info("confirmShipment()");
        List<ShipmentConfirmationModel> shipmentConfirmationModels = new ArrayList<>();
        try {
            shipmentConfirmationModels = eNadawcaService.checkStatus(LocalDateTime.now());
            InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
            SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
            String submitFeedResponseJSON = submitFeedResponse.toJSON();
            LOGGER.info("submitFeedResponseJSON: " + submitFeedResponseJSON);
        } catch (ShipmentConfirmationCsvProcessorException e) {
            e.printStackTrace();
            //TODO zastanowić się co z tym zrobić
        }
        List<OrderModel> orderModels = shipmentConfirmationModelConverter.from(shipmentConfirmationModels);
        try {
            orderService.updateOrderStatus(orderModels, OrderStatusType.SENT);
        } catch (OrderNotFoundException e) {
            e.printStackTrace();
            //TODO zastanowić się co z tym zrobić
        }
    }

    public void checkShipment() throws ExecutionException, InterruptedException {
        Callable<String> getFeedSubmissionResultCallable = () -> {
            System.out.println("getFeedSubmissionResultCallable");
            return "";
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> futureResultString = executorService.submit(getFeedSubmissionResultCallable);
        String resultString = futureResultString.get();
    }

}
