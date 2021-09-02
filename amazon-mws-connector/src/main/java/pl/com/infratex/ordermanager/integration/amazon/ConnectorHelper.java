package pl.com.infratex.ordermanager.integration.amazon;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

public class ConnectorHelper {
    private static final Logger LOGGER = Logger.getLogger(ConnectorHelper.class.getName());
    private static final String AMAZON_PROPERTIES_FILE = "amazon.properties";
    private static ConnectorHelper instance;

    private Properties properties;

    private ConnectorHelper() {
        properties = new Properties();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(AMAZON_PROPERTIES_FILE)) {
            properties.load(inputStream);
        } catch (IOException e) {
            LOGGER.severe("Exception with file: " + AMAZON_PROPERTIES_FILE);
        }
    }

    public static ConnectorHelper getInstance() {
        if (instance == null) {
            instance = new ConnectorHelper();
        }
        return instance;
    }

    public String getPropertyValue(String propertyKey) {
        return System.getenv(propertyKey);
//        return properties.getProperty(propertyKey);
    }
}
