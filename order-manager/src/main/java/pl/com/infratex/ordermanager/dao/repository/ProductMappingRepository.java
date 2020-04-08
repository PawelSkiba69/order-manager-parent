package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.infratex.ordermanager.dao.entity.ProductMappingEntity;

@Repository
public interface ProductMappingRepository extends JpaRepository<ProductMappingEntity,Long> {
    ProductMappingEntity findBySku(String sku);
}
