package pl.com.infratex.ordermanager.service;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.api.exception.order.OrderNotFoundException;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.repository.OrderRepository;
import pl.com.infratex.ordermanager.web.model.OrderModel;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class OrderVerifierServiceTest {

    @Autowired
    private OrderVerifierService orderVerifierService;

    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Ignore
    void markOrderStatusUnknown() throws OrderNotFoundException {
        //GIVEN
        List<OrderEntity> orderEntities = Arrays.asList(
                new OrderEntity(OrderStatusType.UPLOADED),
                new OrderEntity(OrderStatusType.GENERATED),
                new OrderEntity(OrderStatusType.LABELED),
                new OrderEntity(OrderStatusType.LABELED)
        );

        List<OrderEntity> savedOrderEntities = orderRepository.saveAll(orderEntities);
        Long verifyOId = savedOrderEntities.get(1).getoId();

        List<OrderModel> unshippedOrders = Arrays.asList(
                OrderModel.builder().oId(savedOrderEntities.get(0).getoId()).status(OrderStatusType.LABELED).build(),
                OrderModel.builder().oId(savedOrderEntities.get(2).getoId()).status(OrderStatusType.GENERATED).build(),
                OrderModel.builder().oId(savedOrderEntities.get(3).getoId()).status(OrderStatusType.LABELED).build()
        );

        //WHEN
        orderVerifierService.markOrderStatusUnknown(unshippedOrders);
        OrderEntity verifyEntity = orderRepository.findByoId(verifyOId);

        //THEN
        Assert.assertEquals("Order status is not " + OrderStatusType.UNKNOWN.name(),
                OrderStatusType.UNKNOWN, verifyEntity.getStatus());
    }
}