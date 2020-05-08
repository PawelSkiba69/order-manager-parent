package pl.com.infratex.ordermanager.web.model.coverter;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class OrderModelConverterTest {

    @Test
    void convert() {
        //given
        OrderModelConverter orderModelConverter=new OrderModelConverter();
        OrderModel orderModel = OrderModel.builder()
                .orderId("9482702802223")
                .build();
        ClientModel clientModel=new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa");
        clientModel.setShipAddress2("23");
        clientModel.setShipAddress3("");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("ES");
        orderModel.setClient(clientModel);
        List<OrderModel> orders = asList(
                orderModel
        );
        //when
        orderModelConverter.convert(orders);
        //then
        assertEquals(orders.get(0).getClient().getShipAddress2(),"BRZOZOWA 23","Address isn't merged");
    }
}