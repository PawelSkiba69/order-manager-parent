package pl.com.infratex.ordermanager.api;

public enum OrderStatusType {
    UPLOADED,
    GENERATED,
    SENT_ENADAWCA,
    LABELED,
    CANCELLED,
    UNDELIVERED,
    RETURNED,
    SHIPPED_AMAZON,
    SHIP_CONFIRM_ERROR
}
