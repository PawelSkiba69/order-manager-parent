package pl.com.infratex.ordermanager.integration.enadawca;

import pl.com.infratex.ordermanager.integration.enadawca.exception.ENadawcaException;
import pl.poczta_polska.e_nadawca.BuforType;
import pl.poczta_polska.e_nadawca.ElektronicznyNadawca;
import pl.poczta_polska.e_nadawca.ElektronicznyNadawca_Service;
import pl.poczta_polska.e_nadawca.ErrorType;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;

public class ENadawcaManager {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaManager.class.getName());
    private ElektronicznyNadawca elektronicznyNadawca;
    private GregorianCalendar dataNadania;
    private int idBufor;
    private String opis;
    private List<PrzesylkaType> shipments;

    public ENadawcaManager() {
        ENadawcaCredentialsManager eNadawcaCredentialsManager=new ENadawcaCredentialsManager();
        ENadawcaCredentials eNadawcaCredentials = eNadawcaCredentialsManager.geteNadawcaCredentials();

        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(
                        eNadawcaCredentials.getLogin(),
                        eNadawcaCredentials.getPassword().toCharArray());
            }
        });

        ElektronicznyNadawca_Service elektronicznyNadawcaService = new ElektronicznyNadawca_Service();
        elektronicznyNadawca = elektronicznyNadawcaService.getENSoap();
    }

    public List<String> generateGuids(int amount) {
        return elektronicznyNadawca.getGuid(amount);
    }

    public void elektronicznyNadawcaProperties(GregorianCalendar dataNadania, int idBufor, String opis) throws ENadawcaException {
        XMLGregorianCalendar startDateXML = null;
        try {
            startDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataNadania);

            BuforType buforType = new BuforType();
//            buforType.setIdBufor(idBufor);
            buforType.setOpis(opis);
            buforType.setDataNadania(startDateXML);

            List<BuforType> listBufors = new ArrayList<>();
            listBufors.add(buforType);

            Holder<List<BuforType>> holderBufors = new Holder(buforType);
            List<ErrorType> errors = elektronicznyNadawca.setEnvelopeBuforDataNadania(startDateXML);
            Holder<List<ErrorType>> holderErrors = new Holder(errors);

            elektronicznyNadawca.setEnvelopeBuforDataNadania(startDateXML);
            elektronicznyNadawca.createEnvelopeBufor(listBufors, holderBufors, holderErrors);
        } catch (DatatypeConfigurationException e) {
            throw new ENadawcaException("Błędny format daty nadania", e);
        }
    }

    public void addShipment(List<PrzesylkaType> shipments, int idBufor) {
        LOGGER.info("addShipment " + shipments + " id Bufor: " + idBufor);
        elektronicznyNadawca.addShipment(shipments, idBufor);
    }
}