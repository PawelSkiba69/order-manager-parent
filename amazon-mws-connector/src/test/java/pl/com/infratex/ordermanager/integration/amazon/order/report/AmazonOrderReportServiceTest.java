package pl.com.infratex.ordermanager.integration.amazon.order.report;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.integration.amazon.config.AmazonMwsConnectorTestContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = AmazonMwsConnectorTestContext.class)
class AmazonOrderReportServiceTest {

    @Autowired
    private AmazonOrderReportService amazonOrderReportService;

    @Test
    void orderReport() {
        //GIVEN

        //WHEN
        AmazonOrderReportResult amazonOrderReportResult = amazonOrderReportService.orderReport();
        //THEN
        assertAll(
                () -> assertNotNull(amazonOrderReportResult,"amazonOrderReportResult is null"),
                () -> assertNotNull(amazonOrderReportResult.getNewOrdersOutputStream(),"newOrdersOutputStream is null"),
                () -> assertNotNull(amazonOrderReportResult.getUnshippedOrdersOutputStream(),"unshippedOrdersOutputStream is null")
        );
    }

//    @SpringBootApplication
//    static class TestApplicationContext{
//
//    }
}