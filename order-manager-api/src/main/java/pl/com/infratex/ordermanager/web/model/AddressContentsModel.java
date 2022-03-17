package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressContentsModel {
    private String description;
    private int quantity;
    private int weight;
    private String originCountryCode;
    private BigDecimal value= BigDecimal.ZERO;
}
