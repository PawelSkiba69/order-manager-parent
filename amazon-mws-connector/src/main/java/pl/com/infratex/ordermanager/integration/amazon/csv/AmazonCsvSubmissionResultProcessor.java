package pl.com.infratex.ordermanager.integration.amazon.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ERROR_CODE;
import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ERROR_MESSAGE;
import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ERROR_TYPE;
import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ORDER_ID;
import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ORDER_ITEM_ID;
import static pl.com.infratex.ordermanager.integration.amazon.csv.model.AmazonCsvSubmissionResultModel.ORIGINAL_RECORD_NUMBER;

@Component
public class AmazonCsvSubmissionResultProcessor {
    private static final Logger LOGGER = Logger.getLogger(AmazonCsvSubmissionResultProcessor.class.getName());

//    private ByteArrayOutputStream processingResult;

//    public AmazonCsvSubmissionResultProcessor(ByteArrayOutputStream processingResult) {
//        this.processingResult = processingResult;
//    }

//    public void setProcessingResult(ByteArrayOutputStream processingResult) {
//        this.processingResult = processingResult;
//    }

    public List<AmazonCsvSubmissionResultModel> processResult(ByteArrayOutputStream processingResult) throws IOException {
        LOGGER.info("processResult()");
        List<AmazonCsvSubmissionResultModel> amazonCsvSubmissionResultModels = new ArrayList<>();

        BufferedReader bufferedReader = IOUtils.buffer(
                new InputStreamReader(new ByteArrayInputStream(processingResult.toByteArray())));

        String line = null;
        for (int i = 0; i < 4; i++) {
            line = bufferedReader.readLine();
        }

        if (line != null) {
//            LOGGER.info("####: " + bufferedReader.readLine());
            CSVParser csvParser = CSVFormat.TDF.withHeader().parse(bufferedReader);
//            List<CSVRecord> csvRecords = csvParser.getRecords();
            LOGGER.info("#### csvRecords: " + csvParser);
            for (CSVRecord csvRecord : csvParser) {
                AmazonCsvSubmissionResultModel amazonCsvSubmissionResultModel = new AmazonCsvSubmissionResultModel();
                LOGGER.info("#### " + csvRecord);
                //original-record-number	order-id	order-item-id	error-code	error-type	error-message
                amazonCsvSubmissionResultModel.setOriginalRecordNumber(csvRecord.get(ORIGINAL_RECORD_NUMBER));
                amazonCsvSubmissionResultModel.setOrderId(csvRecord.get(ORDER_ID));
                amazonCsvSubmissionResultModel.setOrderItemId(csvRecord.get(ORDER_ITEM_ID));
                amazonCsvSubmissionResultModel.setErrorCode(csvRecord.get(ERROR_CODE));
                amazonCsvSubmissionResultModel.setErrorType(csvRecord.get(ERROR_TYPE));
                amazonCsvSubmissionResultModel.setErrorMessage(csvRecord.get(ERROR_MESSAGE));
                amazonCsvSubmissionResultModels.add(amazonCsvSubmissionResultModel);
            }
        }
        return amazonCsvSubmissionResultModels;
    }
}
