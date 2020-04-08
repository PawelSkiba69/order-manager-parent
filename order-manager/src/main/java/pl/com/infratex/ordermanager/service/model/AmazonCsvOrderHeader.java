package pl.com.infratex.ordermanager.service.model;

public enum AmazonCsvOrderHeader {
    ORDER_ID("order-id"),
    ORDER_ITEM_ID("order-item-id"),
    PURCHASE_DATE("purchase-date"),
    BUYER_EMAIL("buyer-email"),
    BUYER_NAME("buyer-name"),
    BUYER_PHONE_NUMBER("buyer-phone-number"),
    SKU("sku"),
    PRODUCT_NAME("product-name"),
    QUANTITY_PURCHASED("quantity-purchased"),
    RECIPIENT_NAME("recipient-name"),
    SHIP_ADDRESS_1("ship-address-1"),
    SHIP_ADDRESS_2("ship-address-2"),
    SHIP_ADDRESS_3("ship-address-3"),
    SHIP_CITY("ship-city"),
    SHIP_STATE("ship-state"),
    SHIP_POSTAL_CODE("ship-postal-code"),
    SHIP_COUNTRY("ship-country"),
    IS_BUSINESS_ORDER("is-business-order"),
    CURRENCY("currency"),
    ITEM_PRICE("item-price"),
    ITEM_TAX("item-tax"),
    SHIPPING_PRICE("shipping-price"),
    SHIPPING_TAX("shipping-tax"),
    SHIP_PHONE_NUMBER("ship-phone-number");

    private String name;

    AmazonCsvOrderHeader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
