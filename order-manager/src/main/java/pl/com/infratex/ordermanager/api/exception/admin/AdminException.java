package pl.com.infratex.ordermanager.api.exception.admin;

public class AdminException extends Exception {
    public AdminException(String message) {
        super(message);
    }

    public AdminException(String message, Throwable cause) {
        super(message, cause);
    }
}
