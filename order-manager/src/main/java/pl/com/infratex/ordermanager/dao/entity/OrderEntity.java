package pl.com.infratex.ordermanager.dao.entity;

import pl.com.infratex.ordermanager.api.OrderStatusType;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
@NamedQuery(name = "latestLoadedOrders", query = "SELECT o FROM OrderEntity o")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oId;

    private String orderId;
    private String orderItemId;
    private LocalDateTime purchaseDate;
    private int quantityPurchased;
    private boolean isBusinessOrder;
    private String currency;
    private BigDecimal itemPrice;
    private BigDecimal itemTax;
    private BigDecimal shippingPrice;
    private BigDecimal shippingTax;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "PRODUCT_ID")
    private ProductEntity product;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "CLIENT_ID")
    private ClientEntity client;

    private LocalDateTime loadDate;
    @Enumerated(EnumType.STRING)
    private OrderStatusType status;
    private String guid;
    private Integer batchId;

    public OrderEntity() {
    }

    public OrderEntity(OrderStatusType status) {
        this.status = status;
    }

    public OrderEntity(LocalDateTime loadDate, OrderStatusType status) {
        this.loadDate = loadDate;
        this.status = status;
    }

    public OrderEntity(Long oId, String orderId, String orderItemId, LocalDateTime purchaseDate, int quantityPurchased, boolean isBusinessOrder, String currency, BigDecimal itemPrice, BigDecimal itemTax, BigDecimal shippingPrice, BigDecimal shippingTax, ProductEntity product, ClientEntity client, LocalDateTime loadDate, OrderStatusType status, String guid, Integer batchId) {
        this.oId = oId;
        this.orderId = orderId;
        this.orderItemId = orderItemId;
        this.purchaseDate = purchaseDate;
        this.quantityPurchased = quantityPurchased;
        this.isBusinessOrder = isBusinessOrder;
        this.currency = currency;
        this.itemPrice = itemPrice;
        this.itemTax = itemTax;
        this.shippingPrice = shippingPrice;
        this.shippingTax = shippingTax;
        this.product = product;
        this.client = client;
        this.loadDate = loadDate;
        this.status = status;
        this.guid = guid;
        this.batchId = batchId;
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

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
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

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "oId=" + oId +
                ", product=" + product +
                ", client=" + client +
                ", loadDate=" + loadDate +
                ", status=" + status +
                '}';
    }
}
