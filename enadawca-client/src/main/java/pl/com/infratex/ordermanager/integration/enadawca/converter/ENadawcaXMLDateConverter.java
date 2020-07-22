package pl.com.infratex.ordermanager.integration.enadawca.converter;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class ENadawcaXMLDateConverter {
    public static XMLGregorianCalendar from(LocalDateTime localDateTime) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(
                localDateTime.getYear(),
                //NOTE BE AWARE OF MAGIC VARIABLES
                localDateTime.getMonthValue() - 1,
                localDateTime.getDayOfMonth());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        XMLGregorianCalendar xmlGregorianCalendar = null;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(sdf.format(gregorianCalendar.getTime()));
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        return xmlGregorianCalendar;
    }

    public static LocalDateTime from(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar != null) {
            return xmlGregorianCalendar.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
        }
        return LocalDateTime.now();
    }
}
