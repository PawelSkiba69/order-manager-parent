package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.model.SubmitFeedResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmitFeedConnector;
import pl.com.infratex.ordermanager.service.csv.shipment.confirmation.ShipmentConfirmationCsvProcessor;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ShipmentConfirmationManagerServiceTest {

    @Autowired
    private ShipmentConfirmationManagerService shipmentConfirmationManagerService;
    @Autowired
    private ENadawcaService eNadawcaService;
    @Autowired
    private ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    @Autowired
    private AmazonSubmitFeedConnector amazonSubmitFeedConnector;


    @Test
    void confirmShipmentWithoutENadawca() throws ShipmentConfirmationCsvProcessorException {
        //GIVEN
        List<ShipmentConfirmationModel> shipmentConfirmationModels = Arrays.asList(
                ShipmentConfirmationModel.builder()
                        .carrierCode("Poczta Polska")
                        .carrierName("Correos")
                        .dataNadania(LocalDateTime.now())
                        .guid("2j3i2rpp")
                        .numerNadania("RR874292802PL")
                        .orderId("203-839434-83892")
                        .build(),
                ShipmentConfirmationModel.builder()
                        .carrierCode("Poczta Polska")
                        .carrierName("La Poste")
                        .dataNadania(LocalDateTime.now())
                        .guid("2j3ythfd")
                        .numerNadania("RR87555402PL")
                        .orderId("805-64663-86592")
                        .build()
        );
        //WHEN
        List<ShipmentConfirmationModel> shipmentConfirmationModels1 = eNadawcaService.checkStatus();
        System.out.println("shipmentConfirmationModels: "+shipmentConfirmationModels1);
        InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels1);
        SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
        System.out.println("submitFeedResponse: "+submitFeedResponse);
        //THEN
    }
}