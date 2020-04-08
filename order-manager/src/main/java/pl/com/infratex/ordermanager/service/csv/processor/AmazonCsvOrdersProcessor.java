package pl.com.infratex.ordermanager.service.csv.processor;

import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;

import java.io.IOException;
import java.util.List;

public interface AmazonCsvOrdersProcessor {
    List<AmazonCsvOrder> parseOrders() throws IOException;
}
