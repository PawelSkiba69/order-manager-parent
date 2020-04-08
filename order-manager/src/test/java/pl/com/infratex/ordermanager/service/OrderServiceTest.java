package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderServiceTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final String GUID_1 = "92ry298n9820";
    private static final String GUID_2 = "iuahe938dn24";
    private static final String GUID_3 = "1sry138nfs20";

    @Test
    void copyGuids() {
        //Given
        OrderService orderService = new OrderService(null, null);
        //When
        List<AddressModel> addresses = asList(
                AddressModel.builder().oId(O_ID_1).guid(GUID_1).build(),
                AddressModel.builder().oId(O_ID_2).guid(GUID_2).build(),
                AddressModel.builder().oId(O_ID_3).guid(GUID_3).build());

        List<OrderModel> orders = asList(
                OrderModel.builder().oId(O_ID_1).build(),
                OrderModel.builder().oId(O_ID_2).build(),
                OrderModel.builder().oId(O_ID_3).build());

        List<OrderModel> orderWithGuids = orderService.copyGuids(addresses, orders);
        //Then
        assertAll(
                () -> assertEquals(GUID_1, orderWithGuids.get(0).getGuid()),
                () -> assertEquals(GUID_2, orderWithGuids.get(1).getGuid()),
                () -> assertEquals(GUID_3, orderWithGuids.get(2).getGuid())
        );
    }

    @Test
    void updateOrdersWithGuids() {
    }
}