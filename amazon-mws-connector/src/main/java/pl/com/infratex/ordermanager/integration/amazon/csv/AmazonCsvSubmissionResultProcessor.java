package pl.com.infratex.ordermanager.integration.amazon.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Logger;

public class AmazonCsvSubmissionResultProcessor {
    private static final Logger LOGGER = Logger.getLogger(AmazonCsvSubmissionResultProcessor.class.getName());

    private Reader reader;

    public AmazonCsvSubmissionResultProcessor(Reader reader) {
        this.reader = reader;
    }

    public void processResult() throws IOException {
        LOGGER.info("processResult()");
//        ((InputStreamReader) reader).readLine();
        ((BufferedReader) reader).readLine();
        ((BufferedReader) reader).readLine();
        ((BufferedReader) reader).readLine();

        String line = ((BufferedReader) reader).readLine();
        LOGGER.info("#### line: " + line);


//        CSVParser csvRecords = CSVFormat.TDF.withHeader().parse(reader);

    }
}
