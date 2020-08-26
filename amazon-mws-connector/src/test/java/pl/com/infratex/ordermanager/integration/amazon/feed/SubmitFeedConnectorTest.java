package pl.com.infratex.ordermanager.integration.amazon.feed;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class SubmitFeedConnectorTest {

    @Test
    void submitFeed() {
        //GIVEN
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("test-my-feed.txt");

        SubmitFeedConnector submitFeedConnector = new SubmitFeedConnector();
        //WHEN
        submitFeedConnector.submitFeed(new BufferedInputStream(inputStream));
        //THEN
    }
}