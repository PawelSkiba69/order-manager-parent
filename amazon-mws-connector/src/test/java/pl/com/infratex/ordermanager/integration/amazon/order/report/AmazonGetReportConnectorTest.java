package pl.com.infratex.ordermanager.integration.amazon.order.report;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.integration.amazon.config.AmazonMwsConnectorTestContext;

import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = AmazonMwsConnectorTestContext.class)
class AmazonGetReportConnectorTest {

    @Autowired
    AmazonGetReportConnector amazonGetReportConnector;

    @Test
    void report() {
        //GIVEN
        String reportId="29874871028018732";
        //WHEN
        OutputStream outputStream = amazonGetReportConnector.report(reportId);
        //THEN
        assertAll(
                () -> assertNotNull(outputStream,"outputStream is null")
        );
    }
}