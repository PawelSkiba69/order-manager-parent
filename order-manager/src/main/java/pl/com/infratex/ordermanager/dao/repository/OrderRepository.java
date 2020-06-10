package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    List<OrderEntity> findByStatusOrderByProduct_InternalIdDesc(OrderStatusType status);

    List<OrderEntity> findByOrderIdAndOrderItemId(String orderId, String orderItemId);

    List<OrderEntity> findByOrderItemIdInOrderByProduct_InternalIdDesc(List<String> orderIds);

    @Query(name = "latestLoadedOrders")
    List<OrderEntity> latestLoadedOrders();
}
