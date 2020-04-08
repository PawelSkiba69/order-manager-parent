package pl.com.infratex.ordermanager.api.exception.order;

public class OrderException extends OrderManagerException {
    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }
}
