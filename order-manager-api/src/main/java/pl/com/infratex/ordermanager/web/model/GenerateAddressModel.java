package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenerateAddressModel {
    private Boolean saveAll = false;
    private Boolean saveMcf = false;
    private List<OrderModel> orders;
    private Boolean[] chosen;
}
