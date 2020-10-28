package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerOrderReportModel {

//    private SellerModel seller;
    private List <OrderModel> orders;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate sendDate;


//    public SellerOrderReportModel(List<OrderModel> orders) {
//        this.orders=orders;
//    }
}
