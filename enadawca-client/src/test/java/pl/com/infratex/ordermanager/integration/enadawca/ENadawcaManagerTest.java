package pl.com.infratex.ordermanager.integration.enadawca;

import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeConfigurationException;

import static org.junit.jupiter.api.Assertions.*;

class ENadawcaManagerTest {
    @Test
    void checkStatus() throws DatatypeConfigurationException {
        //GIVEN
        ENadawcaManager eNadawcaManager=new ENadawcaManager();
        String guid="";
        //WHEN
        eNadawcaManager.checkStatus(guid);
        //THEN
    }
}