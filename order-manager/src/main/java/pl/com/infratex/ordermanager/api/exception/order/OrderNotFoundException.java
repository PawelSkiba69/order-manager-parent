package pl.com.infratex.ordermanager.api.exception.order;

public class OrderNotFoundException extends OrderException {
    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
