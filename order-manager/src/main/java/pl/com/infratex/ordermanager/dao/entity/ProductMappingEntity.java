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

    @Override
    public String toString() {
        return "ProductMapping{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", internalProductName='" + internalProductName + '\'' +
                '}';
    }
}
