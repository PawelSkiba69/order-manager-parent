package pl.com.infratex.ordermanager.api.exception.order;

public class OrderMultiChannelFulfillmentCsvProcessorException extends OrderException {
    public OrderMultiChannelFulfillmentCsvProcessorException(String message) {
        super(message);
    }

    public OrderMultiChannelFulfillmentCsvProcessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
