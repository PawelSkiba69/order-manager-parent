package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OrderServiceIntegrationTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final String GUID_1 = "92ry298n9820";
    private static final String GUID_2 = "iuahe938dn24";
    private static final String GUID_3 = "1sry138nfs20";

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderModelMapper orderModelMapper;

    @Test
    void updateOrdersWithGuids() {
        //given
        OrderService orderService=new OrderService(orderRepository,orderModelMapper);
        List<AddressModel> addresses = asList(
                AddressModel.builder().oId(O_ID_1).guid(GUID_1).build(),
                AddressModel.builder().oId(O_ID_2).guid(GUID_2).build(),
                AddressModel.builder().oId(O_ID_3).guid(GUID_3).build());

        List<OrderModel> orders = asList(
                OrderModel.builder().oId(O_ID_1).build(),
                OrderModel.builder().oId(O_ID_2).build(),
                OrderModel.builder().oId(O_ID_3).build());
        //when
        List<OrderEntity> orderEntities = orderService.updateOrdersWithGuids(addresses, orders);
        System.out.println(orderEntities);
        //then
        assertEquals(addresses.size(),orderEntities.size(),"size isn't equals");
    }
}