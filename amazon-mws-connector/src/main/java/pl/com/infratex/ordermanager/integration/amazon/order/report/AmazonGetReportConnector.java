package pl.com.infratex.ordermanager.integration.amazon.order.report;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetReportRequest;
import com.amazonaws.mws.model.GetReportResponse;
import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.integration.amazon.ConnectorHelper;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

@Service
public class AmazonGetReportConnector {

    private static final Logger LOGGER = Logger.getLogger(AmazonGetReportConnector.class.getName());

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String KI = "KI";
    private static final String AK = "AK";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String M_ID = "A3NLKSN848UAEB";

    public OutputStream report(String reportId) {

        LOGGER.info("report(" + reportId + ")");

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ConnectorHelper.getInstance().getPropertyValue(KI),
                ConnectorHelper.getInstance().getPropertyValue(AK),
                APP_NAME, APP_VERSION, config);

        GetReportRequest getReportRequest = new GetReportRequest();
        getReportRequest.setMerchant(M_ID);

        getReportRequest.setReportId(reportId);

//        OutputStream reportOne = new FileOutputStream( "report-1.xml" );
        ByteArrayOutputStream processingResult = new ByteArrayOutputStream();
        getReportRequest.setReportOutputStream(processingResult);
        LOGGER.info("processingResult before invokeGetReport: "+processingResult.size());
        GetReportResponse getReportResponse = invokeGetReport(service, getReportRequest);
        LOGGER.info("processingResult after invokeGetReport: "+processingResult.size());

//        ByteArrayOutputStream reportOutputStream = (ByteArrayOutputStream) getReportRequest.getReportOutputStream();
//        LOGGER.info("reportOutputStream: "+reportOutputStream.size());

        LOGGER.info("report(" + reportId + ")");
        return processingResult;
    }

    public static GetReportResponse invokeGetReport(MarketplaceWebService service, GetReportRequest requests) {

        GetReportResponse response = null;

//        Future<GetReportResponse> getReportResponseFuture = service.getReportAsync(requests);
//
//        while (!getReportResponseFuture.isDone()) {
//            Thread.yield();
//        }
        try {

//            response = getReportResponseFuture.get();
            response =service.getReport(requests);
            // Original request corresponding to this response, if needed:
            // GetReportRequest originalRequest = requests.get(responses.indexOf(getReportResponseFuture));
            System.out.println("Result md5checksum : " + response.getGetReportResult().getMD5Checksum());
            System.out.println("Response request id: " + response.getResponseMetadata().getRequestId());
            System.out.println("Report: ");
            // System.out.println( requests.get( responses.indexOf(getReportResponseFuture)).getReportOutputStream().toString());
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();
        } catch (Exception e) {
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
            return response;
    }
}
