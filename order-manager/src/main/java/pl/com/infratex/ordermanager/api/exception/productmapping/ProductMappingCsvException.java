package pl.com.infratex.ordermanager.api.exception.productmapping;

public class ProductMappingCsvException extends ProductMappingException {
    public ProductMappingCsvException(String message) {
        super(message);
    }

    public ProductMappingCsvException(String message, Throwable cause) {
        super(message, cause);
    }
}
