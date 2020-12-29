package pl.com.infratex.ordermanager.dao.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.dao.entity.ProductMappingEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductMappingRepositoryTest {

    private static final String INTERNAL_PRODUCT_NAME_UPPERCASE="MEDION ORYG";

    @Autowired
    private ProductMappingRepository productMappingRepository;

    @Test
    void given_when_then(){
       //given
        ProductMappingEntity productMappingEntity=new ProductMappingEntity();
        productMappingEntity.setInternalProductName("Medion OryG");
        //when
        ProductMappingEntity savedProductMappingEntity = productMappingRepository.save(productMappingEntity);
        System.out.println(savedProductMappingEntity);
        Optional<ProductMappingEntity> optionalProductMappingEntity = productMappingRepository.findById(savedProductMappingEntity.getId());
        ProductMappingEntity foundProductMappingEntity = optionalProductMappingEntity.orElse(null);
        System.out.println(foundProductMappingEntity);
        //then
        Assertions.assertAll(
                () ->assertEquals(INTERNAL_PRODUCT_NAME_UPPERCASE,foundProductMappingEntity.getInternalProductName(),"internalProductName is not all Uppercase")
        );
    }
}