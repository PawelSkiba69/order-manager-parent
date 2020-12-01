package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMappingModel {
    private Long id;
    private String sku;
    private String internalProductName;
    private String asin;
    private int condition;

    public ProductMappingModel(String sku, String internalProductName) {
        this.sku = sku;
        this.internalProductName = internalProductName;
    }

    public ProductMappingModel(String sku, String internalProductName, String asin, int condition) {
        this.sku = sku;
        this.internalProductName = internalProductName;
        this.asin = asin;
        this.condition = condition;
    }
}
