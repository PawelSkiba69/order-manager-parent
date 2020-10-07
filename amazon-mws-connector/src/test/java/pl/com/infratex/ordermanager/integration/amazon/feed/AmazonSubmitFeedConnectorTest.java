package pl.com.infratex.ordermanager.integration.amazon.feed;

import com.amazonaws.mws.model.SubmitFeedResponse;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AmazonSubmitFeedConnectorTest {

    @Test
    void submitFeed() {
        //GIVEN
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test-my-feed.txt");

        AmazonSubmitFeedConnector amazonSubmitFeedConnector = new AmazonSubmitFeedConnector();
        //WHEN
        SubmitFeedResponse response = amazonSubmitFeedConnector.submitFeed(new BufferedInputStream(inputStream));
        //THEN
        assertNotNull(response,"response is null");
    }
}