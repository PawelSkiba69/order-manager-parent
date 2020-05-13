package pl.com.infratex.ordermanager.dao.entity;

import pl.com.infratex.ordermanager.service.model.ProductMappingCondition;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_MAPPINGS")
public class ProductMappingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sku;
    private String internalProductName;
    private String asin;
    private int condition;
    @Enumerated
    private ProductMappingCondition productCondition;

    public ProductMappingEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getInternalProductName() {
        return internalProductName;
    }

    public void setInternalProductName(String internalProductName) {
        this.internalProductName = internalProductName;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public ProductMappingCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductMappingCondition productCondition) {
        this.productCondition = productCondition;
    }

    @Override
    public String toString() {
        return "ProductMappingEntity{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", internalProductName='" + internalProductName + '\'' +
                ", asin='" + asin + '\'' +
                ", condition=" + condition +
                ", productCondition=" + productCondition +
                '}';
    }
}
