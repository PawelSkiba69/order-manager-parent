package pl.com.infratex.ordermanager.utils;

import pl.com.infratex.ordermanager.api.exception.OrderManagerDateUtilsException;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

public class OrderManagerDateUtils {

    private static final Logger LOGGER = Logger.getLogger(OrderManagerDateUtils.class.getName());

    public static GregorianCalendar createGregorianCalendar(LocalDate localDate) {
        LOGGER.info("createGregorianCalendar(" + localDate + ")");
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(Date.from(localDate.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant()));
//        LOGGER.info("createGregorianCalendar(...)=" + gregorianCalendar);
        return gregorianCalendar;
    }

    public static XMLGregorianCalendar createXmlGregorianCalendar(GregorianCalendar gregorianCalendar) throws OrderManagerDateUtilsException {
        LOGGER.info("createXmlGregorianCalendar()");
        XMLGregorianCalendar xmlGregorianCalendar;

        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            throw new OrderManagerDateUtilsException("Błędny format daty", e);
        }

//        LOGGER.info("createXmlGregorianCalendar(...)=" + xmlGregorianCalendar);
        return xmlGregorianCalendar;
    }

    public static XMLGregorianCalendar createXmlGregorianCalendar(LocalDate localDate) throws OrderManagerDateUtilsException {
        LOGGER.info("createXmlGregorianCalendar(" + localDate + ")");
        GregorianCalendar gregorianCalendar = createGregorianCalendar(localDate);
        XMLGregorianCalendar xmlGregorianCalendar = createXmlGregorianCalendar(gregorianCalendar);
//        LOGGER.info("createXmlGregorianCalendar(...)=" + xmlGregorianCalendar);
        return xmlGregorianCalendar;
    }
}

