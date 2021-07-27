package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.com.infratex.ordermanager.api.OrderStatusType;

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
    private String asin;
    private String condition;
    private LocalDateTime purchaseDate;
    private String purchaseDateFormatted;
    private int quantityPurchased;
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
    private boolean inProcess;
    private OrderStatusType status;

    private String guid;
    private Integer batchId;

    private String currencySymbol;
    private BigDecimal totalPrice;

    private boolean chosen = true;

    public OrderModel(Long oId, String orderId, BigDecimal itemPrice) {
        this.oId = oId;
        this.orderId = orderId;
        this.itemPrice = itemPrice;
    }

    public OrderModel(Long oId, String orderId, BigDecimal itemPrice,LocalDateTime purchaseDate, int quantityPurchased,
                        BigDecimal shippingPrice,String currency) {
        this.oId = oId;
        this.orderId = orderId;
        this.itemPrice = itemPrice;
        this.purchaseDate = purchaseDate;
        this.quantityPurchased = quantityPurchased;
        this.shippingPrice = shippingPrice;
        this.currency = currency;
    }

    public boolean isChosen() {
        return chosen;
    }

    public void setChosen(boolean chosen) {
        this.chosen = chosen;
    }
}
