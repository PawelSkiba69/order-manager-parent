package pl.com.infratex.ordermanager.integration.amazon.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class AmazonCsvSubmissionResultProcessor {
    private static final Logger LOGGER = Logger.getLogger(AmazonCsvSubmissionResultProcessor.class.getName());

    private ByteArrayOutputStream processingResult;

    public AmazonCsvSubmissionResultProcessor(ByteArrayOutputStream processingResult) {
        this.processingResult = processingResult;
    }

    public void processResult() throws IOException {
        LOGGER.info("processResult()");
//        byte[] bytes = processingResult.toByteArray();
//        LOGGER.info("#### bytes: " + Arrays.toString(bytes));
//        Reader reader = new InputStreamReader(new ByteArrayInputStream(processingResult.toByteArray()));
//        BufferedReader bufferedReader = IOUtils.buffer(reader);
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
            for (CSVRecord csvRecord:csvParser){
                LOGGER.info("#### "+csvRecord);
                //original-record-number	order-id	order-item-id	error-code	error-type	error-message
                String originalRecordNumber = csvRecord.get("original-record-number");
                String orderId = csvRecord.get("order-id");
                String orderItemId = csvRecord.get("order-item-id");
                String errorCode = csvRecord.get("error-code");
                String errorType = csvRecord.get("error-type");
                String errorMessage = csvRecord.get("error-message");

            }
        }

    }
}
