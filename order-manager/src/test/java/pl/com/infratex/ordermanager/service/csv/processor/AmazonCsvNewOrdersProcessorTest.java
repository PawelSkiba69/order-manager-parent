package pl.com.infratex.ordermanager.service.csv.processor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import pl.com.infratex.ordermanager.api.exception.order.AmazonCsvOrderProcessorException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import static org.junit.jupiter.api.Assertions.*;

class AmazonCsvNewOrdersProcessorTest {

    @Test
    void parseOrdersOk() throws IOException {
        // given
        ClassPathResource classPathResource = new ClassPathResource("csv/newOrdersFromAmazon.txt");
        Reader reader = new FileReader(new File(classPathResource.getURI()));
        AmazonCsvNewOrdersProcessor amazonCsvNewOrdersProcessor=new AmazonCsvNewOrdersProcessor(reader);
        // when
        // then
        Assertions.assertDoesNotThrow(amazonCsvNewOrdersProcessor::parseOrders,
                "nieprawidłowy rodzaj raportu");
    }

    @Test
    void parseOrdersNotOk() throws IOException {
        // given
        ClassPathResource classPathResource = new ClassPathResource("csv/unshippedOrdersFromAmazon.txt");
        Reader reader = new FileReader(new File(classPathResource.getURI()));
        AmazonCsvNewOrdersProcessor amazonCsvNewOrdersProcessor=new AmazonCsvNewOrdersProcessor(reader);
        // when
        // then
        Assertions.assertThrows(AmazonCsvOrderProcessorException.class,
                amazonCsvNewOrdersProcessor::parseOrders, "prawidłowy rodzaj raportu");
    }
}