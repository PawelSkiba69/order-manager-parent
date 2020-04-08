package pl.com.infratex.ordermanager.service.csv.processor;

import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class AmazonCsvProcessor {

    private static final Logger LOGGER = Logger.getLogger(AmazonCsvProcessor.class.getName());

    public List<AmazonCsvOrder> parseCsv(AmazonCsvOrdersProcessor amazonCsvOrdersProcessor) throws IOException {
        LOGGER.info("Processing amazon csv ...");
        return amazonCsvOrdersProcessor.parseOrders();
    }
}
