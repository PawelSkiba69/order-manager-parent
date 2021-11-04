package pl.com.infratex.ordermanager.dao.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class OrderRepositoryTest {
    @Autowired
    private OrderRepository orderRepository;

    @Test
    void findByLoadDateBeforeAndStatusIn() {
        //GIVEN
        List<OrderEntity> orderEntities = Arrays.asList(
                new OrderEntity(LocalDateTime.now().minusDays(1), OrderStatusType.UNKNOWN),
                new OrderEntity(LocalDateTime.now().minusDays(2), OrderStatusType.SHIPPED_AMAZON),
                new OrderEntity(LocalDateTime.now().minusDays(4), OrderStatusType.SHIPPED_AMAZON),
                new OrderEntity(LocalDateTime.now().minusDays(11), OrderStatusType.UNKNOWN),
                new OrderEntity(LocalDateTime.now().minusDays(5), OrderStatusType.GENERATED),
                new OrderEntity(LocalDateTime.now(), OrderStatusType.UNKNOWN)
        );

        List<OrderEntity> savedOrderEntities = orderRepository.saveAll(orderEntities);

        //WHEN
        List<OrderEntity> foundOrderEntities = orderRepository.findByLoadDateBeforeAndStatusIn(
                LocalDateTime.now().minusDays(3),
                OrderStatusType.SHIPPED_AMAZON, OrderStatusType.UNKNOWN);
        //THEN
        Assertions.assertEquals(2, foundOrderEntities.size(), "Liczba orders nie zgadza się");
    }

}