package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

    private Long oId;
    private String orderId;
    private String orderItemId;
    private LocalDateTime purchaseDate;
    private String purchaseDateFormatted;
    private String quantityPurchased;
    private boolean isBusinessOrder;
    private String currency;
    private BigDecimal itemPrice;
    private BigDecimal itemTax;
    private BigDecimal shippingPrice;
    private BigDecimal shippingTax;

    private ProductModel product;
    private ClientModel client;

    private LocalDateTime loadDate;
    private boolean generatedAddress;
    private int status;

    private String guid;

    public OrderModel(Long oId, String orderId, BigDecimal itemPrice) {
        this.oId = oId;
        this.orderId = orderId;
        this.itemPrice = itemPrice;
    }
}
