package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationStatusType;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;
import pl.poczta_polska.e_nadawca.StatusType;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentConfirmationMapperTest {

    public static final String NUMER_NADANIA_RR_4934820_PL = "RR4934820PL";
    public static final String GUID_1 = "843002030s";

    @Test
    void givenXMLStatusType_whenConvert_thenShipmentConfirmationStatusType() {
        //GIVEN
        StatusType statusType = StatusType.NIEPOTWIERDZONA;
        //WHEN
        ShipmentConfirmationStatusType status = ShipmentConfirmationStatusType.fromValue(statusType.value());
        //THEN
        assertEquals(ShipmentConfirmationStatusType.POTWIERDZONA, status, "Statusy nie są takie same");
    }

    @Test
    void map() throws Exception {
        //GIVEN
        ShipmentConfirmationMapper shipmentConfirmationMapper=new ShipmentConfirmationMapper();

        PrzesylkaShortType przesylkaShortType = new PrzesylkaShortType();
        przesylkaShortType.setNumerNadania(NUMER_NADANIA_RR_4934820_PL);
        przesylkaShortType.setGuid(GUID_1);

        GregorianCalendar startDateCalendar = new GregorianCalendar(2020, 6, 20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(startDateCalendar.getTime());

        XMLGregorianCalendar dataNadania = DatatypeFactory.newInstance().newXMLGregorianCalendar(sdf.format(startDateCalendar.getTime()));
        przesylkaShortType.setDataNadania(dataNadania);

        przesylkaShortType.setStatus(StatusType.NOWA);

        //WHEN
        ShipmentConfirmationModel shipmentConfirmationModel = shipmentConfirmationMapper.map(przesylkaShortType);
        //THEN
        assertAll(
                ()->assertEquals(NUMER_NADANIA_RR_4934820_PL,shipmentConfirmationModel.getNumerNadania(),"numery nadania nie są takie same"),
                ()->assertEquals(LocalDateTime.now(),shipmentConfirmationModel.getDataNadania(),"daty nadania nie są takie same")
        );
        ;
    }
}