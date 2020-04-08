package pl.com.infratex.ordermanager.service.utils;

import org.springframework.core.io.ClassPathResource;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.csv.processor.AmazonCsvOrdersMergeProcessor;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class AmazonCsvProcessorSampleData {

    @Deprecated
    public static List<AmazonCsvOrder> parseCsv() throws IOException {
        ClassPathResource classPathResourceUnshippedOrders = new ClassPathResource("csv/18435540075018196.txt");
        ClassPathResource classPathResourceNewOrders = new ClassPathResource("csv/18433847258018196.txt");
        Reader readerUnshipped = new InputStreamReader(classPathResourceUnshippedOrders.getInputStream());
        Reader readerNewOrders = new InputStreamReader(classPathResourceNewOrders.getInputStream());
        AmazonCsvOrdersMergeProcessor amazonCsvOrdersMergeProcessor = new AmazonCsvOrdersMergeProcessor();

        return amazonCsvOrdersMergeProcessor.mergeOrders(readerUnshipped, readerNewOrders);
    }
}