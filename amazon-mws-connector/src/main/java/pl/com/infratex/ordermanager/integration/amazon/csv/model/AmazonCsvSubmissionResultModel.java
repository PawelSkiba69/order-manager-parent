package pl.com.infratex.ordermanager.integration.amazon.csv.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AmazonCsvSubmissionResultModel {

    private String originalRecordNumber;
    private String orderId;
    private String orderItemId;
    private String errorCode;
    private String errorType;
    private String errorMessage;
}
