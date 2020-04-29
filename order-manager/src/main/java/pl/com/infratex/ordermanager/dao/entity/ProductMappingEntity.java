package pl.com.infratex.ordermanager.dao.entity;

import javax.persistence.Entity;
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
    private String condition;

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

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "ProductMappingEntity{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", internalProductName='" + internalProductName + '\'' +
                ", asin='" + asin + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
