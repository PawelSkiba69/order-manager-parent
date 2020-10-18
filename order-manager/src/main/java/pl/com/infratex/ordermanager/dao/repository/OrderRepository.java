package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    String SQL = "select * \n" +
            " from ORDERS O \n" +
            " where O.BATCH_ID = \n" +
            "    (select max(OMAX.BATCH_ID) from ORDERS OMAX) ";

    List<OrderEntity> findByStatusOrderByProduct_InternalIdDesc(OrderStatusType status);

    OrderEntity findFirstByStatusOrderByLoadDateAsc(OrderStatusType status);

    List<OrderEntity> findByStatus(OrderStatusType status);

    OrderEntity findByOrderIdAndOrderItemId(String orderId, String orderItemId);

    List<OrderEntity> findByOrderItemIdInOrderByProduct_InternalIdDesc(List<String> orderIds);

    @Query(name = "latestLoadedOrders", value = SQL, nativeQuery = true)
    List<OrderEntity> latestLoadedOrders();
}
//select *
//        from ORDERS O
//        where O.BATCH_ID =
//        (select max(OMAX.BATCH_ID) from ORDERS OMAX)