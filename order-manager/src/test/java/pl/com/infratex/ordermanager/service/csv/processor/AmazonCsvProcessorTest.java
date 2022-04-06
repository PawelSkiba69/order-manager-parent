package pl.com.infratex.ordermanager.service.csv.processor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.api.exception.order.AmazonCsvOrderProcessorException;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;

import java.io.IOException;
import java.util.List;

public class AmazonCsvProcessorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void parseCsv() throws IOException, AmazonCsvOrderProcessorException {
        List<AmazonCsvOrder> amazonCsvOrders = AmazonCsvProcessorSampleDataTest.parseCsv();
        Assertions.assertTrue(amazonCsvOrders.size() > 0, "csv orders is 0");
        for (AmazonCsvOrder amazonCsvOrder : amazonCsvOrders) {
            Assertions.assertNotNull(amazonCsvOrder.getItemPrice(), "item price for order " + amazonCsvOrder.getOrderId() + " is null");
        }
    }
}