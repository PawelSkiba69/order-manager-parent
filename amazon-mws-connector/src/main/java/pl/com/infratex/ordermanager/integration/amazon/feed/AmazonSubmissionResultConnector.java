package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetFeedSubmissionResultRequest;
import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.integration.amazon.ConnectorHelper;
import pl.com.infratex.ordermanager.integration.amazon.csv.AmazonCsvSubmissionResultProcessor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

@Component
public class AmazonSubmissionResultConnector {
    private static final Logger LOGGER = Logger.getLogger(AmazonSubmissionResultConnector.class.getName());

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String KI = "KI";
    private static final String AK = "AK";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String M_ID = "A3NLKSN848UAEB";

    public GetFeedSubmissionResultResponse feedSubmissionResult(String feedSubmissionId) throws IOException, MarketplaceWebServiceException {
        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ConnectorHelper.getInstance().getPropertyValue(KI),
                ConnectorHelper.getInstance().getPropertyValue(AK),
                APP_NAME, APP_VERSION, config);

        GetFeedSubmissionResultRequest request = new GetFeedSubmissionResultRequest();
        request.setMerchant(M_ID);

        // FIXME:
//        request.setFeedSubmissionId("52421018652");
        request.setFeedSubmissionId(feedSubmissionId);

        ByteArrayOutputStream processingResult = new ByteArrayOutputStream();
        request.setFeedSubmissionResultOutputStream(processingResult);

        AmazonCsvSubmissionResultProcessor amazonCsvSubmissionResultProcessor = new AmazonCsvSubmissionResultProcessor();
        amazonCsvSubmissionResultProcessor.processResult(processingResult);

        return invokeGetFeedSubmissionResult(service, request);
    }

    private GetFeedSubmissionResultResponse invokeGetFeedSubmissionResult(MarketplaceWebService service,
                                                                          GetFeedSubmissionResultRequest request) throws MarketplaceWebServiceException {
        try {
            return service.getFeedSubmissionResult(request);
//            System.out.println ("GetFeedSubmissionResult Action Response");
//            System.out.println ("=============================================================================");
//            System.out.println ();
//
//            System.out.print("    GetFeedSubmissionResultResponse");
//            System.out.println();
//            System.out.print("    GetFeedSubmissionResultResult");
//            System.out.println();
//            System.out.print("            MD5Checksum");
//            System.out.println();
//            System.out.print("                " + response.getGetFeedSubmissionResultResult().getMD5Checksum());
//            System.out.println();
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
//
//            System.out.println("Feed Processing Result");
//            System.out.println ("=============================================================================");
//            System.out.println();
//            System.out.println( request.getFeedSubmissionResultOutputStream().toString() );
//            System.out.println(response.getResponseHeaderMetadata());
//            System.out.println();
//            System.out.println();
        } catch (Exception ex) {
            System.out.println("Caught Exception: " + ex.getMessage());
//            System.out.println("Response Status Code: " + ex.getStatusCode());
//            System.out.println("Error Code: " + ex.getErrorCode());
//            System.out.println("Error Type: " + ex.getErrorType());
//            System.out.println("Request ID: " + ex.getRequestId());
//            System.out.print("XML: " + ex.getXML());
//            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }

        return null;
    }
}
