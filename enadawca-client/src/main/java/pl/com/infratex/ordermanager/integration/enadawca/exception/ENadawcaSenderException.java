package pl.com.infratex.ordermanager.integration.enadawca.exception;

public class ENadawcaSenderException extends ENadawcaException {

    public ENadawcaSenderException(String message) {
        super(message);
    }

    public ENadawcaSenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
