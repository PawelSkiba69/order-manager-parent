package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.model.RequestReportResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.integration.amazon.config.AmazonMwsConnectorTestContext;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = AmazonMwsConnectorTestContext.class)
class AmazonRequestReportConnectorTest {

    @Autowired
    private AmazonRequestReportConnector amazonRequestReportConnector;

    @Test
    void reportNewOrders() {
        //GIVEN

        //WHEN
        RequestReportResponse requestReportResponse = amazonRequestReportConnector.report(AmazonOrderReportService.NEW_ORDERS_REPORT_TYPE);
        //THEN
        assertAll(
                () -> assertNotNull(requestReportResponse,"requestReportResponse is null")
        );
    }

    @Test
    void reportUnshippedOrders() {
        //GIVEN

        //WHEN
        RequestReportResponse requestReportResponse = amazonRequestReportConnector.report(AmazonOrderReportService.UNSHIPPED_ORDERS_REPORT_TYPE);
        //THEN
        assertAll(
                () -> assertNotNull(requestReportResponse,"requestReportResponse is null")
        );
    }
}