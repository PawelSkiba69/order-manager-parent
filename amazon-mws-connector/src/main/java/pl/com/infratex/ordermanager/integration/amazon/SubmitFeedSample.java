/******************************************************************************* 
 *  Copyright 2009 Amazon Services.
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  
 *  You may not use this file except in compliance with the License. 
 *  You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 *  CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 *  specific language governing permissions and limitations under the License.
 * ***************************************************************************** 
 *
 *  Marketplace Web Service Java Library
 *  API Version: 2009-01-01
 *  Generated: Wed Feb 18 13:28:48 PST 2009 
 * 
 */

package pl.com.infratex.ordermanager.integration.amazon;

import com.amazonaws.mws.*;
import com.amazonaws.mws.model.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 
 * Submit Feed Samples
 * 
 * 
 */
public class SubmitFeedSample {

    /**
     * Just add a few required parameters, and try the service Submit Feed
     * functionality
     * 
     * @param args
     *            unused
     */
    /**
     * @param args
     */
    public static void main(String... args) {

        /************************************************************************
         * Access Key ID and Secret Access Key ID, obtained from:
         * http://aws.amazon.com
         ***********************************************************************/
        final String accessKeyId = ConnectorHelper.getInstance().getPropertyValue("KI");
        final String secretAccessKey = ConnectorHelper.getInstance().getPropertyValue("AK");

        final String appName = "order-manager";
        final String appVersion = "1.0.0";

        MarketplaceWebServiceConfig config = new MarketplaceWebServiceConfig();

        /************************************************************************
         * Uncomment to set the appropriate MWS endpoint.
         ************************************************************************/
        // US
        // config.setServiceURL("https://mws.amazonservices.com/");
        // UK
         config.setServiceURL("https://mws.amazonservices.co.uk/");
        // Germany
        // config.setServiceURL("https://mws.amazonservices.de/");
        // France
        // config.setServiceURL("https://mws.amazonservices.fr/");
        // Italy
        // config.setServiceURL("https://mws.amazonservices.it/");
        // Japan
        // config.setServiceURL("https://mws.amazonservices.jp/");
        // China
        // config.setServiceURL("https://mws.amazonservices.com.cn/");
        // Canada
        // config.setServiceURL("https://mws.amazonservices.ca/");
        // India
        // config.setServiceURL("https://mws.amazonservices.in/");

        /************************************************************************
         * You can also try advanced configuration options. Available options are:
         *
         *  - Signature Version
         *  - Proxy Host and Proxy Port
         *  - User Agent String to be sent to Marketplace Web Service
         *
         ***********************************************************************/

        /************************************************************************
         * Instantiate Http Client Implementation of Marketplace Web Service        
         ***********************************************************************/

        MarketplaceWebService service = new MarketplaceWebServiceClient(
                accessKeyId, secretAccessKey, appName, appVersion, config);


        /************************************************************************
         * Setup request parameters and uncomment invoke to try out sample for
         * Submit Feed
         ***********************************************************************/

        /************************************************************************
         * Marketplace and Merchant IDs are required parameters for all
         * Marketplace Web Service calls.
         ***********************************************************************/
        final String merchantId = "A3NLKSN848UAEB";
//        final String sellerDevAuthToken = "A3NLKSN848UAEB";
        // marketplaces to which this feed will be submitted; look at the
        // API reference document on the MWS website to see which marketplaces are
        // included if you do not specify the list yourself
        final IdList marketplaces = new IdList(Arrays.asList(
        		"Marketplae1",
        		"Marketplace2"));

        SubmitFeedRequest request = new SubmitFeedRequest();
        request.setMerchant(merchantId);
        //request.setMWSAuthToken(sellerDevAuthToken);
//        request.setMarketplaceIdList(marketplaces); FIXME: odkomentować jeśli potrzebne

        request.setFeedType("_POST_FLAT_FILE_FULFILLMENT_DATA_");

        // MWS exclusively offers a streaming interface for uploading your
        // feeds. This is because
        // feed sizes can grow to the 1GB+ range - and as your business grows
        // you could otherwise
        // silently reach the feed size where your in-memory solution will no
        // longer work, leaving you
        // puzzled as to why a solution that worked for a long time suddenly
        // stopped working though
        // you made no changes. For the same reason, we strongly encourage you
        // to generate your feeds to
        // local disk then upload them directly from disk to MWS via Java -
        // without buffering them in Java
        // memory in their entirety.
        // Note: MarketplaceWebServiceClient will not retry a submit feed request
        // because there is no way to reset the InputStream from our client. 
        // To enable retry, recreate the InputStream and resubmit the feed
        // with the new InputStream. 
        //
        try {
            FileInputStream fis = new FileInputStream("my-feed.txt" /*or
            "my-flat-file.txt" if you use flat files*/);
            request.setFeedContent(fis);
//            byte[] bytes = Files.readAllBytes(Paths.get("my-feed.txt"));
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            md.update(bytes);
//            byte[] digest = md.digest();
//            String md5Hash = DatatypeConverter.printHexBinary(digest);

            String md5Value = SubmitFeedSample.computeContentMD5Value(fis);
            request.setContentMD5(md5Value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        invokeSubmitFeed(service, request);

    }

    /**
     * Submit Feed request sample Uploads a file for processing together with
     * the necessary metadata to process the file, such as which type of feed it
     * is. PurgeAndReplace if true means that your existing e.g. inventory is
     * wiped out and replace with the contents of this feed - use with caution
     * (the default is false).
     * 
     * @param service
     *            instance of MarketplaceWebService service
     * @param request
     *            Action to invoke
     */
    public static void invokeSubmitFeed(MarketplaceWebService service,
            SubmitFeedRequest request) {
        try {

            SubmitFeedResponse response = service.submitFeed(request);

            System.out.println("SubmitFeed Action Response");
            System.out
            .println("=============================================================================");
            System.out.println();

            System.out.print("    SubmitFeedResponse");
            System.out.println();
            if (response.isSetSubmitFeedResult()) {
                System.out.print("        SubmitFeedResult");
                System.out.println();
                SubmitFeedResult submitFeedResult = response
                .getSubmitFeedResult();
                if (submitFeedResult.isSetFeedSubmissionInfo()) {
                    System.out.print("            FeedSubmissionInfo");
                    System.out.println();
                    FeedSubmissionInfo feedSubmissionInfo = submitFeedResult
                    .getFeedSubmissionInfo();
                    if (feedSubmissionInfo.isSetFeedSubmissionId()) {
                        System.out.print("                FeedSubmissionId");
                        System.out.println();
                        System.out.print("                    "
                                + feedSubmissionInfo.getFeedSubmissionId());
                        System.out.println();
                    }
                    if (feedSubmissionInfo.isSetFeedType()) {
                        System.out.print("                FeedType");
                        System.out.println();
                        System.out.print("                    "
                                + feedSubmissionInfo.getFeedType());
                        System.out.println();
                    }
                    if (feedSubmissionInfo.isSetSubmittedDate()) {
                        System.out.print("                SubmittedDate");
                        System.out.println();
                        System.out.print("                    "
                                + feedSubmissionInfo.getSubmittedDate());
                        System.out.println();
                    }
                    if (feedSubmissionInfo.isSetFeedProcessingStatus()) {
                        System.out
                        .print("                FeedProcessingStatus");
                        System.out.println();
                        System.out.print("                    "
                                + feedSubmissionInfo.getFeedProcessingStatus());
                        System.out.println();
                    }
                    if (feedSubmissionInfo.isSetStartedProcessingDate()) {
                        System.out
                        .print("                StartedProcessingDate");
                        System.out.println();
                        System.out
                        .print("                    "
                                + feedSubmissionInfo
                                .getStartedProcessingDate());
                        System.out.println();
                    }
                    if (feedSubmissionInfo.isSetCompletedProcessingDate()) {
                        System.out
                        .print("                CompletedProcessingDate");
                        System.out.println();
                        System.out.print("                    "
                                + feedSubmissionInfo
                                .getCompletedProcessingDate());
                        System.out.println();
                    }
                }
            }
            if (response.isSetResponseMetadata()) {
                System.out.print("        ResponseMetadata");
                System.out.println();
                ResponseMetadata responseMetadata = response
                .getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    System.out.print("            RequestId");
                    System.out.println();
                    System.out.print("                "
                            + responseMetadata.getRequestId());
                    System.out.println();
                }
            }
            System.out.println(response.getResponseHeaderMetadata());
            System.out.println();
            System.out.println();

        } catch (MarketplaceWebServiceException ex) {

            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.print("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            System.out.println(ex);
        }
    }

    /**
     * Calculate content MD5 hash values for feeds stored on disk.
     */
    public static String computeContentMD5Value( FileInputStream fis )
            throws IOException, NoSuchAlgorithmException {

        DigestInputStream dis = new DigestInputStream( fis,
                MessageDigest.getInstance( "MD5" ));

        byte[] buffer = new byte[8192];
        while( dis.read( buffer ) > 0 );

        String md5Content = new String(
                org.apache.commons.codec.binary.Base64.encodeBase64(
                        dis.getMessageDigest().digest()) );

        // Effectively resets the stream to be beginning of the file
        // via a FileChannel.
        fis.getChannel().position( 0 );

        return md5Content;
    }
}
