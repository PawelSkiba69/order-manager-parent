package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

    List<OrderEntity> findByGeneratedAddressTrue();
    List<OrderEntity> findByInProcessTrueOrderByProduct_InternalIdDesc();
    List<OrderEntity> findByStatusOrderByProduct_InternalIdDesc(int status);
    List<OrderEntity> findByOrderByProduct_InternalIdDesc();
    List<OrderEntity> findByOrderIdAndOrderItemId(String orderId,String orderItemId);
    List<OrderEntity> findByOrderItemIdInOrderByProduct_InternalIdDesc(List<String>orderIds);
    @Query(name = "latestLoadedOrders")
    List<OrderEntity> latestLoadedOrders();
        }
