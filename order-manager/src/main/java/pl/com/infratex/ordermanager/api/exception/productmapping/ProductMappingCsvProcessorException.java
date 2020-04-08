package pl.com.infratex.ordermanager.api.exception.productmapping;

public class ProductMappingCsvProcessorException extends ProductMappingCsvException {
    public ProductMappingCsvProcessorException(String message) {
        super(message);
    }

    public ProductMappingCsvProcessorException(String message, Throwable cause) {
        super(message, cause);
    }
}
