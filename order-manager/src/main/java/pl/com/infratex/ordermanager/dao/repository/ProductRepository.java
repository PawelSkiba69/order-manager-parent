package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.infratex.ordermanager.dao.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
