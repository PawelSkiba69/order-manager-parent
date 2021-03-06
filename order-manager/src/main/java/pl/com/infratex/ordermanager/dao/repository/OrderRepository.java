package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    String ORDERS_WITH_LATEST_BATCH_ID_SQL = "SELECT O.*\n" +
            "FROM ORDERS O\n" +
            "JOIN PRODUCTS P ON P.ID=O.PRODUCT_ID\n" +
            "WHERE O.BATCH_ID =\n" +
            "    (SELECT max(OMAX.BATCH_ID)\n" +
            "     FROM ORDERS OMAX)\n" +
            "ORDER BY P.INTERNAL_ID DESC";

    List<OrderEntity> findByStatusOrderByProduct_InternalIdDesc(OrderStatusType status);

    OrderEntity findFirstByStatusOrderByLoadDateAsc(OrderStatusType status);

    List<OrderEntity> findByStatus(OrderStatusType status);

    List<OrderEntity> findByOrderIdAndOrderItemId(String orderId, String orderItemId);

    List<OrderEntity> findByOrderItemIdInOrderByProduct_InternalIdDesc(List<String> orderIds);

    @Query(name = "ordersWithLatestBatchId", value = ORDERS_WITH_LATEST_BATCH_ID_SQL, nativeQuery = true)
    List<OrderEntity> ordersWithLatestBatchId();
}
