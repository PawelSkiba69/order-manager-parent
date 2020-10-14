package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.model.SubmitFeedResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmitFeedConnector;
import pl.com.infratex.ordermanager.service.csv.shipment.confirmation.ShipmentConfirmationCsvProcessor;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ShipmentConfirmationManagerService {
    private static final Logger LOGGER = Logger.getLogger(ShipmentConfirmationManagerService.class.getName());

    private ENadawcaService eNadawcaService;
    private ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    private AmazonSubmitFeedConnector amazonSubmitFeedConnector;

    public ShipmentConfirmationManagerService(ENadawcaService eNadawcaService, ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor, AmazonSubmitFeedConnector amazonSubmitFeedConnector) {
        this.eNadawcaService = eNadawcaService;
        this.shipmentConfirmationCsvProcessor = shipmentConfirmationCsvProcessor;
        this.amazonSubmitFeedConnector = amazonSubmitFeedConnector;
    }

    public void confirmShipment() {
        LOGGER.info("confirmShipment()");
        try {
            List<ShipmentConfirmationModel> shipmentConfirmationModels = eNadawcaService.checkStatus(LocalDateTime.now());
            InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
            SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
            String submitFeedResponseJSON = submitFeedResponse.toJSON();
            LOGGER.info("submitFeedResponseJSON: " + submitFeedResponseJSON);
        } catch (ShipmentConfirmationCsvProcessorException e) {
            e.printStackTrace();
            //TODO zastanowić się co z tym zrobić
        }
    }
}
