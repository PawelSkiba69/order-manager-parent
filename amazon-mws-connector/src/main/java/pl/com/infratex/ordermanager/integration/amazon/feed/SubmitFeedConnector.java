package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.MarketplaceWebService;
import com.amazonaws.mws.MarketplaceWebServiceClient;
import com.amazonaws.mws.MarketplaceWebServiceConfig;
import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.SubmitFeedRequest;
import com.amazonaws.mws.model.SubmitFeedResponse;
import pl.com.infratex.ordermanager.integration.amazon.ConnectorHelper;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

public class SubmitFeedConnector {

    private static final Logger LOGGER = Logger.getLogger(SubmitFeedConnector.class.getName());

    private static final String MWS_AMAZONSERVICES_CO_UK = "https://mws.amazonservices.co.uk/";

    private static final String KI = "KI";
    private static final String AK = "AK";

    private static final String APP_NAME = "order-manager";
    private static final String APP_VERSION = "1.0.0";

    private static final String M_ID = "A3NLKSN848UAEB";
    public static final String POST_FLAT_FILE_FULFILLMENT_DATA_ = "_POST_FLAT_FILE_FULFILLMENT_DATA_";

    public SubmitFeedResponse submitFeed(BufferedInputStream inputStream) {
        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();
        config.setServiceURL(MWS_AMAZONSERVICES_CO_UK);

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                ConnectorHelper.getInstance().getPropertyValue(KI),
                ConnectorHelper.getInstance().getPropertyValue(AK),
                APP_NAME, APP_VERSION, config);

        SubmitFeedRequest request = new SubmitFeedRequest();
        request.setMerchant(M_ID);

        request.setFeedType(POST_FLAT_FILE_FULFILLMENT_DATA_);

        try {
            if (inputStream != null) {


                Path tempPath = Files.createTempFile("prefix", "suffix");
                File tempFile = tempPath.toFile();
                tempFile.deleteOnExit();
                LOGGER.info("tempFile: "+tempFile);
                LOGGER.info("tempPath: "+tempPath);

                FileInputStream fileInputStream = new FileInputStream(tempFile);

                request.setFeedContent(fileInputStream);
                String md5Value = computeContentMD5Value(fileInputStream);
                request.setContentMD5(md5Value);

                return invokeSubmitFeed(service, request);
//                return service.submitFeed(request);
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
    public static String computeContentMD5Value(FileInputStream fis)
            throws IOException, NoSuchAlgorithmException {

        DigestInputStream dis = new DigestInputStream(fis,
                MessageDigest.getInstance("MD5"));

        byte[] buffer = new byte[8192];
        while (dis.read(buffer) > 0) ;

        String md5Content = new String(
                org.apache.commons.codec.binary.Base64.encodeBase64(
                        dis.getMessageDigest().digest()));

        // Effectively resets the stream to be beginning of the file
        // via a FileChannel.
        fis.getChannel().position(0);

        return md5Content;
    }

}
