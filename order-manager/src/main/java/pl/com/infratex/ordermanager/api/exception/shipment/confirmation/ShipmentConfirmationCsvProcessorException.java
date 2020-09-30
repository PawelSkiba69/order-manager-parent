package pl.com.infratex.ordermanager.api.exception.shipment.confirmation;

public class ShipmentConfirmationCsvProcessorException extends Exception {
    public ShipmentConfirmationCsvProcessorException(String message) {
        super(message);
    }

    public ShipmentConfirmationCsvProcessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
