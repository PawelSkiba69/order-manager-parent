package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.SubmitFeedRequest;
import com.amazonaws.mws.model.SubmitFeedResponse;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SubmitFeedConnector {

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String ACCESS_KEY_ID = "AKIAIZ37YS3ETWX2QKLA";
    private static final String SECRET_ACCESS_KEY = "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";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String MERCHANT_ID = "A3NLKSN848UAEB";
    public static final String POST_FLAT_FILE_FULFILLMENT_DATA_ = "_POST_FLAT_FILE_FULFILLMENT_DATA_";

    public SubmitFeedResponse submitFeed(BufferedInputStream inputStream) {
        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ACCESS_KEY_ID, SECRET_ACCESS_KEY, APP_NAME, APP_VERSION, config);

        SubmitFeedRequest request = new SubmitFeedRequest();
        request.setMerchant(MERCHANT_ID);

        request.setFeedType(POST_FLAT_FILE_FULFILLMENT_DATA_);

        try {
            if (inputStream != null) {
                request.setFeedContent(inputStream);

                String md5Value = computeContentMD5Value(inputStream);
                request.setContentMD5(md5Value);

//                return invokeSubmitFeed(service, request);
                return service.submitFeed(request);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public SubmitFeedResponse invokeSubmitFeed(MarketplaceWebService service,
                                               SubmitFeedRequest request) {
        try {
            return service.submitFeed(request);
        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
        }
        return null;
    }

    /**
     * Calculate content MD5 hash values for feeds stored on disk.
     */
    public String computeContentMD5Value(BufferedInputStream inputStream)
            throws IOException, NoSuchAlgorithmException {

//        try (
                DigestInputStream dis = new DigestInputStream(inputStream, MessageDigest.getInstance("MD5"));
//        ) {

            byte[] buffer = new byte[8192];
            while (dis.read(buffer) > 0) ;

            String md5Content = new String(
                    org.apache.commons.codec.binary.Base64.encodeBase64(
                            dis.getMessageDigest().digest()));

            // Effectively resets the stream to be beginning of the file
            // via a FileChannel.
//        inputStream.getChannel().position( 0 ); FIXME Zastanowić się co z tym zrobić
//        ((BufferedInputStream) inputStream).getChannel().position( 0 );
//        ((BufferedInputStream) inputStream).mark(0);
//        ((BufferedInputStream) inputStream).reset();
        inputStream.mark(-1);
        inputStream.reset();

            return md5Content;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
    }
}
