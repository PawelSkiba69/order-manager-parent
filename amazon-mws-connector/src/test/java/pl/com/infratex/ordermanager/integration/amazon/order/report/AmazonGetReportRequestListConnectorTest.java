package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.model.ReportRequestInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.integration.amazon.config.AmazonMwsConnectorTestContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = AmazonMwsConnectorTestContext.class)
class AmazonGetReportRequestListConnectorTest {

    @Autowired
    AmazonGetReportRequestListConnector amazonGetReportRequestListConnector;

    @Test
    void reportList() {
        //GIVEN
        //WHEN
        List<ReportRequestInfo> reportRequestInfos = amazonGetReportRequestListConnector.reportList();
        //THEN
        assertAll(
                () -> assertNotNull(reportRequestInfos,"requestReportResponse is null")
                );
    }
}