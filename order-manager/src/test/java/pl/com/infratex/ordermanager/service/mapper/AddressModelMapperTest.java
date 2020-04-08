package pl.com.infratex.ordermanager.service.mapper;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressModelMapperTest {

    @Test
    void fromOrderModel() {
        ClientModel clientModel=new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("Polska");
        OrderModel orderModel=new OrderModel(12L, "123444", BigDecimal.valueOf(12.99));
//        orderModel.setOId(12L);
//        orderModel.setOrderId("123444");
        orderModel.setCurrency("EUR");
        orderModel.setClient(clientModel);

        AddressModelMapper addressModelMapper=new AddressModelMapper();

        AddressModel addressModel = addressModelMapper.fromOrderModel(orderModel);
        System.out.println(addressModel);
//        assertEquals(orderModel.getOId(),addressModel.getOId());

    }
}