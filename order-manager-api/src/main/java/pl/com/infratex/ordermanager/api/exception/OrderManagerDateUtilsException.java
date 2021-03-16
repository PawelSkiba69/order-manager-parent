package pl.com.infratex.ordermanager.api.exception;

public class OrderManagerDateUtilsException extends Exception {
    public OrderManagerDateUtilsException(String message) {
        super(message);
    }

    public OrderManagerDateUtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}
