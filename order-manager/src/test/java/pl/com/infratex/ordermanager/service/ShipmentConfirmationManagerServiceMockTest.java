package pl.com.infratex.ordermanager.service;

import com.amazonaws.mws.model.SubmitFeedResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import pl.com.infratex.ordermanager.api.exception.shipment.confirmation.ShipmentConfirmationCsvProcessorException;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.amazon.feed.AmazonSubmitFeedConnector;
import pl.com.infratex.ordermanager.service.csv.shipment.confirmation.ShipmentConfirmationCsvProcessor;
import pl.com.infratex.ordermanager.service.enadawca.ENadawcaService;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
class ShipmentConfirmationManagerServiceMockTest {

    @Autowired
    private ShipmentConfirmationManagerService shipmentConfirmationManagerService;
    @Autowired
    private ENadawcaService eNadawcaService;
    @Autowired
    private ShipmentConfirmationCsvProcessor shipmentConfirmationCsvProcessor;
    @Autowired
    private AmazonSubmitFeedConnector amazonSubmitFeedConnector;
    @MockBean
    private OrderService orderService;


    @Test
    void confirmShipmentENadawcaWithOrderServiceMock() throws ShipmentConfirmationCsvProcessorException {
        //GIVEN
        OrderModel orderModel= OrderModel.builder()
                .orderId("408-8953630-8555526")
                .guid("A8883435FE578BD3BE984989C1365E89")
                .loadDate(LocalDateTime.of(2020, 10, 14, 0, 0))
                .build();
        ClientModel clientModel= ClientModel.builder()
                .shipCountry("FR")
                .build();
        orderModel.setClient(clientModel);

        List<OrderModel> orderModels=Arrays.asList(orderModel);
        List<String> guids=Arrays.asList("A8883435FE578BD3BE984989C1365E89");
        List<ShipmentConfirmationModel> shipmentConfirmationModelsForMock = Arrays.asList(
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
        when(orderService.oldestUnshippedLabeledOrder()).thenReturn(orderModel);
        when(orderService.findOrdersByStatusLabeled()).thenReturn(orderModels);
        when(orderService.extractNotNullGuids(orderModels)).thenReturn(guids);

        List<ShipmentConfirmationModel> shipmentConfirmationModels = eNadawcaService.checkStatus(LocalDateTime.now());
        InputStream csvInputStream = shipmentConfirmationCsvProcessor.createCsv(shipmentConfirmationModels);
        SubmitFeedResponse submitFeedResponse = amazonSubmitFeedConnector.submitFeed(csvInputStream);
        //THEN
        assertAll(
                () -> assertNotNull(submitFeedResponse.getSubmitFeedResult(),"submitFeedResult is null")
        );
    }
}