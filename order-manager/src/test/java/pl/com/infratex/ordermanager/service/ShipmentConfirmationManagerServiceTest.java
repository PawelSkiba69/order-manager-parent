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
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
                        .dataNadania(LocalDate.now())
                        .guid("2j3i2rpp")
                        .numerNadania("RR874292802PL")
                        .orderId("203-839434-83892")
                        .build(),
                ShipmentConfirmationModel.builder()
                        .carrierCode("Poczta Polska")
                        .carrierName("La Poste")
                        .dataNadania(LocalDate.now())
                        .guid("2j3ythfd")
                        .numerNadania("RR87555402PL")
                        .orderId("805-64663-86592")
                        .build()
        );
        //WHEN
        InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
        SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
        //THEN
        assertAll(
                () -> assertNotNull(submitFeedResponse.getSubmitFeedResult(),"submitFeedResult is null")
        );
    }

    @Test
    void confirmShipmentWithENadawca(){
        //GIVEN

        //WHEN
        shipmentConfirmationManagerService.confirmShipment();
        //THEN

    }

}