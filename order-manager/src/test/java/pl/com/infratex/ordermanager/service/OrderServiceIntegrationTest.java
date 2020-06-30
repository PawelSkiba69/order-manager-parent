package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.service.mapper.OrderModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OrderServiceIntegrationTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final long O_ID_4 = 4L;
    private static final String GUID_1 = "92ry298n9820";
    private static final String GUID_2 = "iuahe938dn24";
    private static final String GUID_3 = "1sry138nfs20";
    private static final LocalDateTime DATE_1 = LocalDateTime.of(2020, Month.APRIL, 1, 1, 0);
    private static final LocalDateTime DATE_2 = LocalDateTime.of(2020, Month.FEBRUARY, 1, 1, 0);
    private static final LocalDateTime DATE_3 = LocalDateTime.of(2020, Month.MAY, 1, 1, 0);
    private static final LocalDateTime DATE_4 = LocalDateTime.of(2020, Month.JANUARY, 1, 1, 0);


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderModelMapper orderModelMapper;

    @Autowired
    private OrderService orderService;

    @Test
    void updateOrdersWithGuids() {
        //given
        OrderService orderService = new OrderService(orderRepository, orderModelMapper);
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
        //then
        assertEquals(addresses.size(), orderEntities.size(), "size isn't equals");
    }

    @Test
//    @Rollback(false)
    void oldestUnshippedLabeledOrder() {
        //GIVEN
        List<OrderModel> orders = asList(
                OrderModel.builder().oId(O_ID_1).status(OrderStatusType.LABELED).loadDate(DATE_1).build(),
                OrderModel.builder().oId(O_ID_2).status(OrderStatusType.LABELED).loadDate(DATE_2).build(),
                OrderModel.builder().oId(O_ID_3).status(OrderStatusType.LABELED).loadDate(DATE_3).build(),
                OrderModel.builder().oId(O_ID_4).status(OrderStatusType.UPLOADED).loadDate(DATE_4).build());
        List<OrderEntity> entities = orderModelMapper.fromModels(orders);

        //WHEN
        orderRepository.saveAll(entities);
        OrderModel orderModel = orderService.oldestUnshippedLabeledOrder();

        //THEN
        assertEquals(O_ID_2, (long) orderModel.getOId(), "didn't find oldest unshipped order");
    }
}