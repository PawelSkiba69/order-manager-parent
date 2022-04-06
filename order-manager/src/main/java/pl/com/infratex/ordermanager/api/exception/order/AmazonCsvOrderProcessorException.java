package pl.com.infratex.ordermanager.api.exception.order;

public class AmazonCsvOrderProcessorException extends OrderException{

    public AmazonCsvOrderProcessorException(String message) {
        super(message);
    }

    public AmazonCsvOrderProcessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
