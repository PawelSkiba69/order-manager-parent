package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

    List<OrderEntity> findByGeneratedAddressTrue();
    List<OrderEntity> findByGeneratedAddressTrueOrderByProduct_InternalIdDesc();
    List<OrderEntity> findByOrderByProduct_InternalIdDesc();
}
