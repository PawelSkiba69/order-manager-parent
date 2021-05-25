package pl.com.infratex.ordermanager.service.csv.shipment.confirmation;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

//@SpringBootTest
class ShipmentConfirmationCsvProcessorTest {


    @Test
    void createCsv() throws IOException, ShipmentConfirmationCsvProcessorException {
        //GIVEN
        ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor = new ShipmentConfirmationCsvProcessor();
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
//        Files.copy(csvInputStream, Paths.get("Output.csv"));
        //THEN
        assertNotNull(csvInputStream, "InputStream jest null");
    }
}