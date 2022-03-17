package pl.com.infratex.ordermanager.service.mapper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressModelMapperTest {
        private AddressModelMapper addressModelMapper;

    @BeforeEach
    public void setUp() {
        addressModelMapper = new AddressModelMapper();
    }

    @AfterEach
    public void tearDown() {
        addressModelMapper = null;
    }

    @Test
    void given_when_then() {

        // given
        ClientModel clientModel = new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("Polska");

        ProductModel productModel = new ProductModel();
        productModel.setProductName("Remote control for TV Bush");

        OrderModel orderModel = new OrderModel(12L, "123444", BigDecimal.valueOf(12.99));
        orderModel.setCurrency("EUR");
        orderModel.setClient(clientModel);
        orderModel.setProduct(productModel);

        // when
        AddressModel addressModel = addressModelMapper.fromOrderModel(orderModel);

        assertAll(
                () -> assertEquals(orderModel.getOId(), addressModel.getOId()),
                () -> assertNotNull(orderModel.getClient(), "Order Model Client is NULL"),
                () -> assertNotNull(orderModel.getProduct(), "Order Model Product is NULL")
        );
    }
}