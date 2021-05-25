package pl.com.infratex.ordermanager.integration.enadawca.converter;

import org.junit.jupiter.api.Test;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ENadawcaXMLDateConverterTest {

    @Test
    void givenXMLGregorianCalendar_whenConverterMap_thenLocalDateTimeEquals() throws Exception {
        //GIVEN
        GregorianCalendar startDateCalendar = new GregorianCalendar(2020, 6, 20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(startDateCalendar.getTime());

        LocalDateTime expectedLocalDateTime = LocalDateTime.of(2020, Month.JULY, 20, 0, 0);

        XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(sdf.format(startDateCalendar.getTime()));
        //WHEN
        LocalDate localDate = ENadawcaXMLDateConverter.from(xmlGregorianCalendar);
        //THEN
        assertEquals(expectedLocalDateTime,localDate,"daty są różne");
    }

    @Test
    void givenLocalDateTime_whenConverterMap_thenXMLGregorianCalendar() throws Exception {
        //GIVEN
        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.JUNE, 20, 0, 0);

        GregorianCalendar startDateCalendar = new GregorianCalendar(2020, 5, 20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.format(startDateCalendar.getTime());
        XMLGregorianCalendar expectedXmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(sdf.format(startDateCalendar.getTime()));

        //WHEN
        XMLGregorianCalendar xmlGregorianCalendar = ENadawcaXMLDateConverter.from(localDateTime);
        //THEN
        assertEquals(expectedXmlGregorianCalendar,xmlGregorianCalendar,"daty są różne");
    }
}