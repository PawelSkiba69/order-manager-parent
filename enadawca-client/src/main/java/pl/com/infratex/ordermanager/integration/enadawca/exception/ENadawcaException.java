package pl.com.infratex.ordermanager.integration.enadawca.exception;

public class ENadawcaException extends Exception {
    public ENadawcaException(String message) {
        super(message);
    }

    public ENadawcaException(String message, Throwable cause) {
        super(message, cause);
    }
}
