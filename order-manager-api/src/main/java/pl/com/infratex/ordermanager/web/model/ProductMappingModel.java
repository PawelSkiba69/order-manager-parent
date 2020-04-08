package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductMappingModel {
    private Long id;
    private String sku;
    private String internalProductName;

    public ProductMappingModel(String sku, String internalProductName) {
        this.sku = sku;
        this.internalProductName = internalProductName;
    }
}
