package pl.com.infratex.ordermanager.integration.enadawca;

import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.integration.enadawca.converter.ENadawcaXMLDateConverter;
import pl.com.infratex.ordermanager.integration.enadawca.exception.ENadawcaException;
import pl.com.infratex.ordermanager.integration.enadawca.mapper.ShipmentConfirmationMerger;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.poczta_polska.e_nadawca.AddShipmentResponseItemType;
import pl.poczta_polska.e_nadawca.BuforType;
import pl.poczta_polska.e_nadawca.ElektronicznyNadawca;
import pl.poczta_polska.e_nadawca.ElektronicznyNadawca_Service;
import pl.poczta_polska.e_nadawca.EnvelopeInfoType;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.PrzesylkaType;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static pl.poczta_polska.e_nadawca.StatusType.POTWIERDZONA;

public class ENadawcaManager {

    private static final Logger LOGGER = Logger.getLogger(ENadawcaManager.class.getName());
    private static final int GENEREATED_GUIDS_LIMIT = 100;
    private ElektronicznyNadawca elektronicznyNadawca;
    private GregorianCalendar dataNadania;
    private int idBufor;
    private String opis;
    private List<PrzesylkaType> shipments;

    public ENadawcaManager() {
        ENadawcaCredentialsManager eNadawcaCredentialsManager = new ENadawcaCredentialsManager();
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
        List<String> generatedGuids = new ArrayList<>();

        int numberOfGeneratedSets = amount / GENEREATED_GUIDS_LIMIT;

        for (int i = 0; i <= numberOfGeneratedSets; i++) {
            generatedGuids.addAll(elektronicznyNadawca.getGuid(GENEREATED_GUIDS_LIMIT));
        }

        generatedGuids.addAll(elektronicznyNadawca.getGuid(amount - numberOfGeneratedSets * GENEREATED_GUIDS_LIMIT));

        return generatedGuids;
    }

    public void elektronicznyNadawcaProperties(GregorianCalendar dataNadania, int idBufor, String opis) throws ENadawcaException {
        XMLGregorianCalendar startDateXML = null;
        try {
            startDateXML = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataNadania);

            BuforType buforType = new BuforType();
            buforType.setIdBufor(idBufor);
            buforType.setOpis(opis);
            buforType.setDataNadania(startDateXML);

            List<BuforType> listBufors = new ArrayList<>();
            listBufors.add(buforType);

            List<BuforType> holder = new ArrayList<>();
            ;
            Holder<List<BuforType>> holderBufors = new Holder(holder);
//            List<ErrorType> errors = elektronicznyNadawca.setEnvelopeBuforDataNadania(startDateXML);
//            Holder<List<ErrorType>> holderErrors = new Holder(errors);

//            elektronicznyNadawca.setEnvelopeBuforDataNadania(startDateXML);
            elektronicznyNadawca.createEnvelopeBufor(listBufors, holderBufors, null);
        } catch (DatatypeConfigurationException e) {
            throw new ENadawcaException("Błędny format daty nadania", e);
        }
    }

    public void addShipment(List<PrzesylkaType> shipments, int idBufor) {
        LOGGER.info("addShipment " + shipments + " id Bufor: " + idBufor);
        List<AddShipmentResponseItemType> addShipmentResponseItemTypes = elektronicznyNadawca.addShipment(shipments, idBufor);
    }

    public List<ShipmentConfirmationModel> checkStatus(List<OrderModel> unshippedOrders, List<String> guids, LocalDateTime oldestLoadDate) {

        List<ShipmentConfirmationModel> shipmentConfirmationModels = null;

        try {
            XMLGregorianCalendar startDateXML = ENadawcaXMLDateConverter.from(oldestLoadDate);
            XMLGregorianCalendar endDateXML = ENadawcaXMLDateConverter.from(LocalDateTime.now());

            List<EnvelopeInfoType> envelopeList = elektronicznyNadawca.getEnvelopeList(startDateXML, endDateXML);

            List<PrzesylkaShortType> przesylkaShortTypes = filterEnvelope(envelopeList, guids);
            ShipmentConfirmationMerger shipmentConfirmationMerger = new ShipmentConfirmationMerger();

            shipmentConfirmationModels = shipmentConfirmationMerger.merge(przesylkaShortTypes, unshippedOrders);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return shipmentConfirmationModels;
    }

    List<PrzesylkaShortType> filterEnvelope(List<EnvelopeInfoType> envelopeList, List<String> guids) {
        List<PrzesylkaShortType> przesylkiPotwierdzone = new ArrayList<>();

        envelopeList.forEach(envelope ->
                guids.forEach(guid ->
                        przesylkiPotwierdzone.addAll(
                                elektronicznyNadawca.getEnvelopeContentShort(envelope.getIdEnvelope()).stream()
                                        .filter(przesylka -> przesylka.getStatus().equals(POTWIERDZONA))
                                        .filter(przesylka -> przesylka.getGuid().equals(guid))
                                        .collect(Collectors.toList())
                        )
                )
        );

        return przesylkiPotwierdzone;
    }
}
