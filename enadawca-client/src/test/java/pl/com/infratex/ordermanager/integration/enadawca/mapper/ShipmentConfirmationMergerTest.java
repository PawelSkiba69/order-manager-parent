package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationStatusType;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.StatusType;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ShipmentConfirmationMergerTest {

    private static final String NUMER_NADANIA_RR_4934820_PL = "RR4934820PL";
    private static final String NUMER_NADANIA_RR_4534520_PL = "RR4534520PL";
    private static final String GUID_1 = "843002030s";
    private static final String GUID_2 = "343002020s";
    private static final String ORDER_ID_1 = "102-24444-2323232";
    private static final String SHIP_COUNTRY_FR = "FR";
    private static final int SHIPMENT_CONFIRMATION_MODELS_SIZE_1 = 1;
    private static final int SHIPMENT_CONFIRMATION_MODELS_SIZE_2 = 2;

    @Test
    void givenXMLStatusType_whenConvert_thenShipmentConfirmationStatusTypeCorrect() {
        //GIVEN
        StatusType statusType = StatusType.POTWIERDZONA;
        //WHEN
        ShipmentConfirmationStatusType status = ShipmentConfirmationStatusType.fromValue(statusType.value());
        //THEN
        assertEquals(ShipmentConfirmationStatusType.POTWIERDZONA, status, "Statusy nie są takie same");
    }

    @Test
    void givenXMLStatusType_whenConvert_thenShipmentConfirmationStatusTypeIncorrect() {
        //GIVEN
        StatusType statusType = StatusType.NIEPOTWIERDZONA;
        //WHEN
        ShipmentConfirmationStatusType status = ShipmentConfirmationStatusType.fromValue(statusType.value());
        //THEN
        assertNotEquals(ShipmentConfirmationStatusType.POTWIERDZONA, status, "Statusy są takie same");
    }

    @Test
    void givenPrzesylkaShortTypeAndOrderModel_whenMerge_thenShipmentConfirmationModelContainsProperData() throws Exception {
        //GIVEN
        ShipmentConfirmationMerger shipmentConfirmationMerger = new ShipmentConfirmationMerger();

        PrzesylkaShortType przesylkaShortType = new PrzesylkaShortType();
        przesylkaShortType.setNumerNadania(NUMER_NADANIA_RR_4934820_PL);
        przesylkaShortType.setGuid(GUID_1);

        GregorianCalendar startDateCalendar = new GregorianCalendar(2020, 6, 20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(startDateCalendar.getTime());

        LocalDateTime expectedLocalDateTime = LocalDateTime.of(2020, Month.JULY, 20, 0, 0);

        XMLGregorianCalendar dataNadania = DatatypeFactory.newInstance().newXMLGregorianCalendar(sdf.format(startDateCalendar.getTime()));
        przesylkaShortType.setDataNadania(dataNadania);

        przesylkaShortType.setStatus(StatusType.NOWA);

        OrderModel orderModel = new OrderModel();
        orderModel.setGuid(GUID_1);
        orderModel.setOrderId(ORDER_ID_1);
        ClientModel clientModel = new ClientModel();
        clientModel.setShipCountry(SHIP_COUNTRY_FR);
        orderModel.setClient(clientModel);

        //WHEN
        ShipmentConfirmationModel shipmentConfirmationModel = shipmentConfirmationMerger.merge(przesylkaShortType, orderModel);
        //THEN
        assertAll(
                () -> assertEquals(NUMER_NADANIA_RR_4934820_PL, shipmentConfirmationModel.getNumerNadania(), "numery nadania nie są takie same"),
                () -> assertEquals(expectedLocalDateTime, shipmentConfirmationModel.getDataNadania(), "daty nadania nie są takie same"),
                () -> assertEquals(orderModel.getOrderId(), shipmentConfirmationModel.getOrderId(), "id zamówienia nie są takie same"),
                () -> assertEquals(orderModel.getGuid(), shipmentConfirmationModel.getGuid(), "guidy nie są takie same"),
                () -> assertEquals(orderModel.getClient().getShipCountry(), shipmentConfirmationModel.getCarrierCode(), "kody kuriera nie są takie same")
        );
    }

    @Test
    void givenPrzesylkaShortTypesAndOrderModels_whenMergeOnWrongGuids_thenShipmentConfirmationModelsContainsProperData() {
        //GIVEN
        ShipmentConfirmationMerger shipmentConfirmationMerger = new ShipmentConfirmationMerger();
        List<PrzesylkaShortType> przesylkaShortTypes = new ArrayList<>();
        List<OrderModel> orderModels = new ArrayList<>();

        PrzesylkaShortType przesylkaShortType1 = new PrzesylkaShortType();
        przesylkaShortType1.setNumerNadania(NUMER_NADANIA_RR_4934820_PL);
        przesylkaShortType1.setGuid(GUID_1);

        PrzesylkaShortType przesylkaShortType2 = new PrzesylkaShortType();
        przesylkaShortType2.setNumerNadania(NUMER_NADANIA_RR_4534520_PL);
        przesylkaShortType2.setGuid(GUID_2);

        przesylkaShortTypes.add(przesylkaShortType1);
        przesylkaShortTypes.add(przesylkaShortType2);

        OrderModel orderModel1 = new OrderModel();
        orderModel1.setGuid(GUID_1);
        ClientModel clientModel = new ClientModel();
        clientModel.setShipCountry(SHIP_COUNTRY_FR);
        orderModel1.setClient(clientModel);

        OrderModel orderModel2 = new OrderModel();
        orderModel2.setGuid(GUID_2 + "aaa");

        orderModels.add(orderModel1);
        orderModels.add(orderModel2);

        //WHEN
        List<ShipmentConfirmationModel> shipmentConfirmationModels = shipmentConfirmationMerger.merge(przesylkaShortTypes, orderModels);
        //THEN
        assertEquals(SHIPMENT_CONFIRMATION_MODELS_SIZE_1, shipmentConfirmationModels.size(),"niepoprawna liczba scalonych ShipmentConfirmationModels");
    }

    @Test
    void givenPrzesylkaShortTypesAndOrderModels_whenMergeOnCorrectGuids_thenShipmentConfirmationModelsContainsProperData() {
        //GIVEN
        ShipmentConfirmationMerger shipmentConfirmationMerger = new ShipmentConfirmationMerger();
        List<PrzesylkaShortType> przesylkaShortTypes = new ArrayList<>();
        List<OrderModel> orderModels = new ArrayList<>();

        PrzesylkaShortType przesylkaShortType1 = new PrzesylkaShortType();
        przesylkaShortType1.setNumerNadania(NUMER_NADANIA_RR_4934820_PL);
        przesylkaShortType1.setGuid(GUID_1);

        PrzesylkaShortType przesylkaShortType2 = new PrzesylkaShortType();
        przesylkaShortType2.setNumerNadania(NUMER_NADANIA_RR_4534520_PL);
        przesylkaShortType2.setGuid(GUID_2);

        przesylkaShortTypes.add(przesylkaShortType1);
        przesylkaShortTypes.add(przesylkaShortType2);

        OrderModel orderModel1 = new OrderModel();
        orderModel1.setGuid(GUID_1);
        ClientModel clientModel = new ClientModel();
        clientModel.setShipCountry(SHIP_COUNTRY_FR);
        orderModel1.setClient(clientModel);

        OrderModel orderModel2 = new OrderModel();
        orderModel2.setGuid(GUID_2);
        orderModel2.setClient(clientModel);

        orderModels.add(orderModel1);
        orderModels.add(orderModel2);

        //WHEN
        List<ShipmentConfirmationModel> shipmentConfirmationModels = shipmentConfirmationMerger.merge(przesylkaShortTypes, orderModels);
        //THEN
        assertEquals(SHIPMENT_CONFIRMATION_MODELS_SIZE_2, shipmentConfirmationModels.size(), "niepoprawna liczba scalonych ShipmentConfirmationModels");
    }
}