package pl.com.infratex.ordermanager.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmazonCsvOrder {
    //OrderModel
    private String orderId;
    private String orderItemId;
    private LocalDateTime purchaseDate;
    private long quantityPurchased;
    private boolean isBusinessOrder;
    private String currency;
    private BigDecimal itemPrice;
    private BigDecimal itemTax;
    private BigDecimal shippingPrice;
    private BigDecimal shippingTax;
    //ProductModel
    private String sku;
    private String productName;
    //ClientModel
    private String buyerEmail;
    private String buyerName;
    private String buyerPhone;
    private String recipientName;
    private String shipAddress1;
    private String shipAddress2;
    private String shipAddress3;
    private String shipCity;
    private String shipState;
    private String shipPostalCode;
    private String shipCountry;
    private String shipPhoneNumber;
}
