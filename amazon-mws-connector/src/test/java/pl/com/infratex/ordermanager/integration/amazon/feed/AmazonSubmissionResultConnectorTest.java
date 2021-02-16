package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.MarketplaceWebServiceException;
import com.amazonaws.mws.model.GetFeedSubmissionResultResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AmazonSubmissionResultConnectorTest {

    @Test
    void feedSubmissionResult() throws IOException, MarketplaceWebServiceException {
        //GIVEN
        String feedSubmissionId = "52421018652";
        AmazonSubmissionResultConnector amazonSubmissionResultConnector = new AmazonSubmissionResultConnector();
        //WHEN
        GetFeedSubmissionResultResponse getFeedSubmissionResultResponse =
                amazonSubmissionResultConnector.feedSubmissionResult(feedSubmissionId);
        //THEN
        assertNotNull(getFeedSubmissionResultResponse,"rezultat jest nullem");
    }
}