package pl.com.infratex.ordermanager.api.exception.productmapping;

public class ProductMappingException extends Exception {
    public ProductMappingException(String message) {
        super(message);
    }

    public ProductMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
