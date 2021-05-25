package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.MarketplaceWebServiceException;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.integration.amazon.csv.AmazonSubmissionResult;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AmazonSubmissionResultConnectorTest {

    @Test
    void feedSubmissionResult() throws IOException, MarketplaceWebServiceException {
        //GIVEN
        String feedSubmissionId = "53180018765";
        AmazonSubmissionResultConnector amazonSubmissionResultConnector = new AmazonSubmissionResultConnector();
        //WHEN
        AmazonSubmissionResult getFeedSubmissionResultResponse =
                amazonSubmissionResultConnector.feedSubmissionResult(feedSubmissionId);
        //THEN
        assertNotNull(getFeedSubmissionResultResponse,"rezultat jest nullem");
    }
}