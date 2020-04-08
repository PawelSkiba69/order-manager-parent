package pl.com.infratex.ordermanager.service.csv.processor;

import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.utils.AmazonCsvProcessorSampleData;

import java.io.IOException;
import java.util.List;

public class AmazonCsvProcessorSampleDataTest {

    public static List<AmazonCsvOrder> parseCsv() throws IOException {
        return AmazonCsvProcessorSampleData.parseCsv();
    }
}