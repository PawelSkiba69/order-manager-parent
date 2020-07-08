package pl.com.infratex.ordermanager.integration.enadawca;

import org.junit.jupiter.api.Test;
import pl.poczta_polska.e_nadawca.EnvelopeInfoType;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;

import javax.xml.datatype.DatatypeConfigurationException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ENadawcaManagerTest {
    @Test
    void checkStatus() throws DatatypeConfigurationException {
        //GIVEN
        ENadawcaManager eNadawcaManager=new ENadawcaManager();
        List<String> guids= Arrays.asList("","ad32");
        //WHEN
        eNadawcaManager.checkStatus(guids, LocalDateTime.of(2020,4,20,0,0));
        //THEN
    }

    @Test
    void filterEnvelope() {
        //GIVEN
        ENadawcaManager eNadawcaManager=new ENadawcaManager();
        List<String> guids= Arrays.asList("8476E0CBDF0378694935ACB6D67677C6", "5D82C08F7489D9D8FEF7050EF293443E","E43B1190BE1775129AA3630C8DCBDFD4");
        EnvelopeInfoType envelopeInfoType1=new EnvelopeInfoType();
        envelopeInfoType1.setIdEnvelope(132654011);
        EnvelopeInfoType envelopeInfoType2=new EnvelopeInfoType();
        envelopeInfoType2.setIdEnvelope(132574689);
        EnvelopeInfoType envelopeInfoType3=new EnvelopeInfoType();
        envelopeInfoType3.setIdEnvelope(132355163);
        List<EnvelopeInfoType>envelopeInfoTypes=Arrays.asList(envelopeInfoType1,envelopeInfoType2);
        //WHEN
        List<PrzesylkaShortType> przesylkiPotwierdzone = eNadawcaManager.filterEnvelope(envelopeInfoTypes, guids);
        //THEN
        System.out.println(przesylkiPotwierdzone);
    }
}