package pl.com.infratex.ordermanager.web.model;

import lombok.Data;
import pl.com.infratex.ordermanager.web.model.coverter.CurrencyConverter;
import pl.com.infratex.ordermanager.web.model.coverter.OrderModelConverter;

import java.math.BigDecimal;

@Data
public class OrderReportModel {
    private OrderModel orderModel;

    private String currencySymbol;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;

    public OrderReportModel(OrderModel orderModel) {
        this.orderModel = orderModel;

        OrderModelConverter.formatDate(this.orderModel);
        this.currencySymbol= CurrencyConverter.currencyConvertToSymbol(orderModel.getCurrency());
        this.unitPrice=orderModel.getItemPrice().divide(new BigDecimal(orderModel.getQuantityPurchased()));
        this.totalPrice=orderModel.getItemPrice().add(orderModel.getShippingPrice());
    }
}
