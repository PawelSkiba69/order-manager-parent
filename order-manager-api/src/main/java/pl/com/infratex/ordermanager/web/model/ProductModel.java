package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    private Long id;
    private String internalId;
    private String sku;
    private String productName;
    private String orderItemId;
    private String asin;
    private String condition;

    private boolean changedInternalId;
}

