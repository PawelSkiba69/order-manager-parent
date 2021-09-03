package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.model.ReportRequestInfo;
import com.amazonaws.mws.model.RequestReportResponse;
import com.amazonaws.mws.model.RequestReportResult;
import org.springframework.stereotype.Service;

import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

@Service
public class AmazonOrderReportService {
    private static final Logger LOGGER = Logger.getLogger(AmazonOrderReportService.class.getName());

    public static final String NEW_ORDERS_REPORT_TYPE = "_GET_FLAT_FILE_ORDERS_DATA_";
    public static final String UNSHIPPED_ORDERS_REPORT_TYPE = "_GET_FLAT_FILE_ACTIONABLE_ORDER_DATA_";

    private final AmazonRequestReportConnector amazonRequestReportConnector;
    private final AmazonGetReportConnector amazonGetReportConnector;
    private final AmazonGetReportRequestListConnector amazonGetReportRequestListConnector;

    public AmazonOrderReportService(AmazonRequestReportConnector amazonRequestReportConnector,
                                    AmazonGetReportConnector amazonGetReportConnector, AmazonGetReportRequestListConnector amazonGetReportRequestListConnector) {
        this.amazonRequestReportConnector = amazonRequestReportConnector;
        this.amazonGetReportConnector = amazonGetReportConnector;
        this.amazonGetReportRequestListConnector = amazonGetReportRequestListConnector;
    }

    public AmazonOrderReportResult orderReport() {
        LOGGER.info("orderReport()");

        RequestReportResponse newOrdersRequestReportResponse = amazonRequestReportConnector.report(NEW_ORDERS_REPORT_TYPE);
        RequestReportResponse unshippedOrdersRequestReportResponse = amazonRequestReportConnector.report(UNSHIPPED_ORDERS_REPORT_TYPE);
//        LOGGER.info("before reportId "+newOrdersRequestReportResponse);
        String newOrdersReportId = getReportId(newOrdersRequestReportResponse);
        String unshippedOrdersReportId = getReportId(unshippedOrdersRequestReportResponse);
//        LOGGER.info("after reportId "+newOrdersRequestReportResponse);
        List<ReportRequestInfo> reportRequestInfos = amazonGetReportRequestListConnector.reportList();
        String newOrdersGeneratedReportId = filterReportList(reportRequestInfos, newOrdersReportId);
        String unshippedOrdersGeneratedReportId = filterReportList(reportRequestInfos, unshippedOrdersReportId);

        OutputStream newOrdersOutputStream = amazonGetReportConnector.report(newOrdersGeneratedReportId);
        OutputStream unshippedOrdersOutputStream = amazonGetReportConnector.report(unshippedOrdersGeneratedReportId);

        AmazonOrderReportResult amazonOrderReportResult = AmazonOrderReportResult.builder()
                .newOrdersOutputStream(newOrdersOutputStream)
                .unshippedOrdersOutputStream(unshippedOrdersOutputStream)
                .build();

//        LOGGER.info("orderReport() = "+amazonOrderReportResult);
        return amazonOrderReportResult;
    }

    private String getReportId(RequestReportResponse requestReportResponse) {
        LOGGER.info("getReportId(" + requestReportResponse + ")");
        String reportId = null;
        if (requestReportResponse != null) {
            RequestReportResult requestReportResult = requestReportResponse.getRequestReportResult();
            if (requestReportResult != null) {
                ReportRequestInfo reportRequestInfo = requestReportResult.getReportRequestInfo();
                if (reportRequestInfo != null) {
                    String reportRequestId = reportRequestInfo.getReportRequestId();
//                    String generatedReportId = reportRequestInfo.getGeneratedReportId();
                    LOGGER.info("RequestReportId= "+reportRequestId);
                    reportId = reportRequestId;
//                    reportId = generatedReportId;
                }
            }
        }
        LOGGER.info("getReportId(...) = " + reportId);
        return reportId;
    }

    private String filterReportList(List<ReportRequestInfo> reportRequestInfos, String reportId) {

        LOGGER.info("filterReportList("+reportId+")");
        LOGGER.info("filterReportList("+reportId+")="+((reportRequestInfos!=null)?reportRequestInfos.size():0));
//        Optional<ReportRequestInfo> first = reportRequestInfos.stream()
//                .filter(reportRequestInfo -> reportRequestInfo.getReportRequestId().equals(reportId))
//                .findFirst();
        for (ReportRequestInfo reportRequestInfo : reportRequestInfos) {
            String reportRequestId = reportRequestInfo.getReportRequestId();
            LOGGER.info("getReportRequestId("+reportRequestId+")");
            if (reportRequestId.equals(reportId)) {
                String generatedReportId = reportRequestInfo.getGeneratedReportId();
                LOGGER.info("getReportRequestId("+generatedReportId+")");
                return generatedReportId;
            }
        }
        return null;
    }
}
