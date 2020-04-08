package pl.com.infratex.ordermanager.api.exception.admin;

public class AdminProductMappingException extends AdminException {
    public AdminProductMappingException(String message) {
        super(message);
    }

    public AdminProductMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
