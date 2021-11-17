package pl.com.infratex.ordermanager.service.csv.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.api.exception.order.OrderMultiChannelFulfillmentCsvProcessorException;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OrderMultiChannelFulfillmentCsvProcessorTest {

    @Autowired
    OrderMultiChannelFulfillmentCsvProcessor orderMultiChannelFulfillmentCsvProcessor;

    @Test
    void createCsv() throws OrderMultiChannelFulfillmentCsvProcessorException, IOException {

        //GIVEN

        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("23AWAEG")
                .build();

        ClientModel clientModel = new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("GB");
        clientModel.setBuyerEmail("w16ckfncfrjtgkb@marketplace.amazon.co.uk");

        List<OrderModel> orders = Arrays.asList(
                OrderModel.builder()
                        .orderId("9849-442-4-224-24")
                        .orderItemId("235-252-244-2")
                        .currency("EUR")
                        .itemPrice(BigDecimal.valueOf(10L))
                        .product(productModel)
                        .client(clientModel)
                        .build()
        );

        //WHEN
        InputStream csvInputStream = orderMultiChannelFulfillmentCsvProcessor.createCsv(orders);
        Files.copy(csvInputStream, Paths.get("Output2.csv"));
        //THEN
        assertNotNull(csvInputStream, "InputStream jest null");
    }
}