package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.infratex.ordermanager.dao.entity.OrderLoadedEntity;

@Repository
public interface OrderLoadedRepository extends JpaRepository<OrderLoadedEntity, Long> {
    OrderLoadedEntity findByOrderIdAndOrderItemId(String orderId,String orderItemId);
}
