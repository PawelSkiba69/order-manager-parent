package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.RequestReportRequest;
import com.amazonaws.mws.model.RequestReportResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.OrderManagerDateUtilsException;
import pl.com.infratex.ordermanager.integration.amazon.ConnectorHelper;
import pl.com.infratex.ordermanager.utils.OrderManagerDateUtils;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.util.logging.Logger;

@Service
public class AmazonRequestReportConnector {

    private static final Logger LOGGER = Logger.getLogger(AmazonRequestReportConnector.class.getName());

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String KI = "KI";
    private static final String AK = "AK";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String M_ID = "A3NLKSN848UAEB";
    public static final int REPORT_DATE_RANGE_7_DAYS = 7;

    public RequestReportResponse report(String reportType) {
        LOGGER.info("report(" + reportType + ")");

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ConnectorHelper.getInstance().getPropertyValue(KI),
                ConnectorHelper.getInstance().getPropertyValue(AK),
                APP_NAME, APP_VERSION, config);

        RequestReportRequest request = new RequestReportRequest()
                .withMerchant(M_ID)
                .withReportType(reportType)
                .withReportOptions("ShowSalesChannel=true");

        try {
            XMLGregorianCalendar startDate = OrderManagerDateUtils.createXmlGregorianCalendar(LocalDate.now().minusDays(REPORT_DATE_RANGE_7_DAYS));
            request.setStartDate(startDate);
        } catch (OrderManagerDateUtilsException e) {
            e.printStackTrace();
        }

        // @TODO: set additional request parameters here

        try {
            return invokeRequestReport(service, request);
        } catch (MarketplaceWebServiceException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static RequestReportResponse invokeRequestReport(MarketplaceWebService service, RequestReportRequest request) throws MarketplaceWebServiceException {

//        Future<RequestReportResponse> requestReportResponseFuture = service.requestReportAsync(request);
//        while (!requestReportResponseFuture.isDone()) {
//            Thread.yield();
//        }
        RequestReportResponse response = null;
        try {
//            response = requestReportResponseFuture.get();
            response =service.requestReport(request);
        }catch (Exception e) {
            if (e.getCause() instanceof MarketplaceWebServiceException) {
                MarketplaceWebServiceException exception = MarketplaceWebServiceException.class.cast(e.getCause());
                System.out.println("Caught Exception: " + exception.getMessage());
//                System.out.println("Response Status Code: " + exception.getStatusCode());
//                System.out.println("Error Code: " + exception.getErrorCode());
//                System.out.println("Error Type: " + exception.getErrorType());
//                System.out.println("Request ID: " + exception.getRequestId());
//                System.out.print("XML: " + exception.getXML());
//                System.out.println("ResponseHeaderMetadata: " + exception.getResponseHeaderMetadata());
            } else {
                e.printStackTrace();
            }
        }
        //        try {
//            return service.requestReport(request);
//            RequestReportResponse response = service.requestReport(request);
//
//            System.out.println ("RequestReport Action Response");
//            System.out.println ("=============================================================================");
//            System.out.println ();
//
//            System.out.print("    RequestReportResponse");
//            System.out.println();
//            if (response.isSetRequestReportResult()) {
//                System.out.print("        RequestReportResult");
//                System.out.println();
//                RequestReportResult requestReportResult = response.getRequestReportResult();
//                if (requestReportResult.isSetReportRequestInfo()) {
//                    System.out.print("            ReportRequestInfo");
//                    System.out.println();
//                    ReportRequestInfo reportRequestInfo = requestReportResult.getReportRequestInfo();
//                    if (reportRequestInfo.isSetReportRequestId()) {
//                        System.out.print("                ReportRequestId");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getReportRequestId());
//                        System.out.println();
//                    }
//                    if (reportRequestInfo.isSetReportType()) {
//                        System.out.print("                ReportType");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getReportType());
//                        System.out.println();
//                    }
//                    if (reportRequestInfo.isSetStartDate()) {
//                        System.out.print("                StartDate");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getStartDate());
//                        System.out.println();
//                    }
//                    if (reportRequestInfo.isSetEndDate()) {
//                        System.out.print("                EndDate");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getEndDate());
//                        System.out.println();
//                    }
//                    if (reportRequestInfo.isSetSubmittedDate()) {
//                        System.out.print("                SubmittedDate");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getSubmittedDate());
//                        System.out.println();
//                    }
//                    if (reportRequestInfo.isSetReportProcessingStatus()) {
//                        System.out.print("                ReportProcessingStatus");
//                        System.out.println();
//                        System.out.print("                    " + reportRequestInfo.getReportProcessingStatus());
//                        System.out.println();
//                    }
//                }
//            }
//            if (response.isSetResponseMetadata()) {
//                System.out.print("        ResponseMetadata");
//                System.out.println();
//                ResponseMetadata responseMetadata = response.getResponseMetadata();
//                if (responseMetadata.isSetRequestId()) {
//                    System.out.print("            RequestId");
//                    System.out.println();
//                    System.out.print("                " + responseMetadata.getRequestId());
//                    System.out.println();
//                }
//            }
//            System.out.println();
//            System.out.println(response.getResponseHeaderMetadata());
//            System.out.println();
//
//
//        } catch (MarketplaceWebServiceException ex) {
//
//            System.out.println("Caught Exception: " + ex.getMessage());
//            System.out.println("Response Status Code: " + ex.getStatusCode());
//            System.out.println("Error Code: " + ex.getErrorCode());
//            System.out.println("Error Type: " + ex.getErrorType());
//            System.out.println("Request ID: " + ex.getRequestId());
//            System.out.print("XML: " + ex.getXML());
//            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
//        }
        return response;
    }
}
