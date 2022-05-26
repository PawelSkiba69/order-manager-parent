package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    String ORDERS_WITH_LATEST_BATCH_ID_SQL = "SELECT O.*\n" +
            "FROM ORDERS O\n" +
            "JOIN PRODUCTS P ON P.ID=O.PRODUCT_ID\n" +
            "WHERE O.BATCH_ID =\n" +
            "    (SELECT max(OMAX.BATCH_ID)\n" +
            "     FROM ORDERS OMAX)\n" +
            "ORDER BY P.INTERNAL_ID DESC, O.PURCHASE_DATE ASC";
    String ORDERS_WITH_STATUS_NOT_IN_SQL = "SELECT *\n" +
            " FROM ORDERS O\n" +
            " WHERE O.STATUS NOT IN ('SHIPPED_AMAZON', 'UNKNOWN');";

    String ORDERS_WITH_LOAD_DATE_BEFORE_AND_STATUS_IN_SQL = "SELECT * \n" +
            " FROM ORDERS \n" +
            " WHERE STATUS NOT IN ('SHIPPED_AMAZON', 'UNKNOWN') \n" +
            " AND LOAD_DATE < ((CURRENT_DATE) - INTERVAL '3 DAY')";

    List<OrderEntity> findByStatusOrderByProduct_InternalIdDescPurchaseDateAsc(OrderStatusType status);

    OrderEntity findFirstByStatusOrderByLoadDateAsc(OrderStatusType status);

    List<OrderEntity> findByStatus(OrderStatusType status);

    List<OrderEntity> findByStatusNotIn(OrderStatusType... statuses);

    @Query(name = "ordersWithStatusNotIn", value = ORDERS_WITH_STATUS_NOT_IN_SQL, nativeQuery = true)
    List<OrderEntity> ordersWithStatusNotIn();

    List<OrderEntity> findByLoadDateBeforeAndStatusIn(LocalDateTime date, OrderStatusType... statuses);

    @Query(name = "ordersWithLoadDateBeforeAndStatusIn", value = ORDERS_WITH_LOAD_DATE_BEFORE_AND_STATUS_IN_SQL, nativeQuery = true)
    List<OrderEntity> ordersWithLoadDateBeforeAndStatusIn();

    List<OrderEntity> findByOrderIdAndOrderItemId(String orderId, String orderItemId);

    List<OrderEntity> findByOrderItemIdInOrderByProduct_InternalIdDescPurchaseDateAsc(List<String> orderIds);

    @Query(name = "ordersWithLatestBatchId", value = ORDERS_WITH_LATEST_BATCH_ID_SQL, nativeQuery = true)
    List<OrderEntity> ordersWithLatestBatchId();

    OrderEntity findByoId(Long oId);

    List<OrderEntity> findByoIdInOrderByProduct_InternalIdDescPurchaseDateAsc(List<Long> oIds);
}
