package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class OrderManagerServiceTest {

    @Autowired
    private OrderManagerService orderManagerService;

    @Test
    void saveOrders() {
        //given
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
        clientModel.setShipCountry("Polska");

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

        SellerOrderReportModel sellerOrderReportModel = SellerOrderReportModel.builder()
                .orders(orders)
                .build();


        //when
        orderManagerService.saveOrders(sellerOrderReportModel);
        //then
    }

    @Test
    void saveOrders2() {
        //given
        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("23AWAEG")
                .build();

        ProductModel productModelNonExistingSku = ProductModel.builder()
                .productName("Telecomando United")
                .sku("NON_EXISTING_SKU")
                .build();

        ClientModel clientModel = new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("Polska");

        List<OrderModel> orders = Arrays.asList(
                OrderModel.builder()
                        .orderId("9849-442-4-224-24")
                        .orderItemId("235-252-244-2")
                        .currency("EUR")
                        .itemPrice(BigDecimal.valueOf(10L))
                        .product(productModel)
                        .client(clientModel)
                        .build(),
                OrderModel.builder()
                        .orderId("9857-431-4-224-33")
                        .orderItemId("295-257-223-2")
                        .currency("GBP")
                        .itemPrice(BigDecimal.valueOf(12L))
                        .product(productModelNonExistingSku)
                        .client(clientModel)
                        .build()
        );

        SellerOrderReportModel sellerOrderReportModel = SellerOrderReportModel.builder()
                .orders(orders)
                .build();


        //when
        orderManagerService.saveOrders(sellerOrderReportModel);
        //then
    }

    @Test
    void createSellerOrderReportFromAmazon() throws IOException {
        //GIVEN

        //WHEN
        SellerOrderReportModel sellerOrderReportFromAmazon = orderManagerService.createSellerOrderReportFromAmazon();
        System.out.println(sellerOrderReportFromAmazon);
        //THEN
        assertAll(
                ()->assertNotNull(sellerOrderReportFromAmazon,"sellerOrderReportFromAmazon is null"),
                ()->assertNotNull(sellerOrderReportFromAmazon.getOrders(),"Amazon orders is null"),
                ()->assertTrue(sellerOrderReportFromAmazon.getOrders().size()>0,"Amazon order size is 0")
        );

    }
}