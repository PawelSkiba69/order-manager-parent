package pl.com.infratex.ordermanager.integration.amazon.csv.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmazonCsvSubmissionResultModel {

    public static final String ORIGINAL_RECORD_NUMBER = "original-record-number";
    public static final String ORDER_ID = "order-id";
    public static final String ORDER_ITEM_ID = "order-item-id";
    public static final String ERROR_CODE = "error-code";
    public static final String ERROR_TYPE = "error-type";
    public static final String ERROR_MESSAGE = "error-message";

    private String originalRecordNumber;
    private String orderId;
    private String orderItemId;
    private String errorCode;
    private String errorType;
    private String errorMessage;
}
