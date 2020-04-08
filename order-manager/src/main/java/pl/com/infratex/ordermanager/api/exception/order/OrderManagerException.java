package pl.com.infratex.ordermanager.api.exception.order;

public class OrderManagerException extends Exception {
    public OrderManagerException(String message) {
        super(message);
    }

    public OrderManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}
