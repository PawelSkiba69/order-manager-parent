package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ShipmentConfirmationManagerService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationManagerService.class.getName());
//
//    private ENadawcaService eNadawcaService;
//    private ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
//    private AmazonSubmitFeedConnector amazonSubmitFeedConnector;
//
//    public ShipmentConfirmationManagerService(ENadawcaService eNadawcaService, ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor, AmazonSubmitFeedConnector amazonSubmitFeedConnector) {
//        this.eNadawcaService = eNadawcaService;
//        this.shipmentConfirmationCsvProcessor = shipmentConfirmationCsvProcessor;
//        this.amazonSubmitFeedConnector = amazonSubmitFeedConnector;
//    }
//
//    public void confirmShipment(){
//        LOGGER.info("confirmShipment()");
//        List<ShipmentConfirmationModel> shipmentConfirmationModels = eNadawcaService.checkStatus();
//        shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
//        amazonSubmitFeedConnector.submitFeed(null);
//    }
}
