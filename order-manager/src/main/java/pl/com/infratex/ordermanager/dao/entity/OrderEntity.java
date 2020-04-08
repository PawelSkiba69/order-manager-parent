package pl.com.infratex.ordermanager.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
//@NamedQuery(name = "", query = "")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oId;

    private String orderId;
    private String orderItemId;
    private LocalDateTime purchaseDate;
    private String quantityPurchased;
    private boolean isBusinessOrder;
    private String currency;
    private BigDecimal itemPrice;
    private BigDecimal itemTax;
    private BigDecimal shippingPrice;
    private BigDecimal shippingTax;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "PRODUCT_ID")
    private ProductEntity product;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "CLIENT_ID")
    private ClientEntity client;

    private LocalDateTime loadDate;
    private boolean generatedAddress;
    private int status;
    private String guid;

    public OrderEntity() {
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(String quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public boolean isBusinessOrder() {
        return isBusinessOrder;
    }

    public void setBusinessOrder(boolean businessOrder) {
        isBusinessOrder = businessOrder;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public BigDecimal getItemTax() {
        return itemTax;
    }

    public void setItemTax(BigDecimal itemTax) {
        this.itemTax = itemTax;
    }

    public BigDecimal getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(BigDecimal shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public BigDecimal getShippingTax() {
        return shippingTax;
    }

    public void setShippingTax(BigDecimal shippingTax) {
        this.shippingTax = shippingTax;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public LocalDateTime getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(LocalDateTime loadDate) {
        this.loadDate = loadDate;
    }

    public boolean isGeneratedAddress() {
        return generatedAddress;
    }

    public void setGeneratedAddress(boolean generatedAddress) {
        this.generatedAddress = generatedAddress;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "oId=" + oId +
                ", orderId='" + orderId + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", quantityPurchased='" + quantityPurchased + '\'' +
                ", isBusinessOrder=" + isBusinessOrder +
                ", currency='" + currency + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemTax=" + itemTax +
                ", shippingPrice=" + shippingPrice +
                ", shippingTax=" + shippingTax +
                ", product=" + product +
                ", client=" + client +
                ", loadDate=" + loadDate +
                ", preparedAddress=" + generatedAddress +
                ", status=" + status +
                ", guid='" + guid + '\'' +
                '}';
    }
}
