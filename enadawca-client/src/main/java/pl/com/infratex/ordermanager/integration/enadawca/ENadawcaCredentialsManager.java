package pl.com.infratex.ordermanager.integration.enadawca;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ENadawcaCredentialsManager {

    private ENadawcaCredentials eNadawcaCredentials=new ENadawcaCredentials();

    public ENadawcaCredentialsManager() {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("credentials.properties");

        Properties properties=new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String login = properties.getProperty("enadawca.client.login");
        String password = properties.getProperty("enadawca.client.password");

        eNadawcaCredentials.setLogin(login);
        eNadawcaCredentials.setPassword(password);
    }

    public ENadawcaCredentials geteNadawcaCredentials() {
        return eNadawcaCredentials;
    }
}
