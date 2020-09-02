package pl.com.infratex.ordermanager.integration.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectorHelperTest {

    @Test
    void getPropertyValue() {
        //GIVEN
        ConnectorHelper connectorHelper=ConnectorHelper.getInstance();

        //WHEN
        String propertyValue = connectorHelper.getPropertyValue("KI");
        //THEN
        assertAll(
                ()->assertNotNull(propertyValue,"propertyValue is null"),
                ()->assertEquals("sadfe4WFWWWRRW",propertyValue,"propertyValues not equals")
        );

    }
}