package pl.com.infratex.ordermanager.api.exception;

public class ShipmentConfirmationReportException extends Exception {

    public ShipmentConfirmationReportException(String message) {
        super(message);
    }

    public ShipmentConfirmationReportException(String message, Throwable cause) {
        super(message, cause);
    }
}
