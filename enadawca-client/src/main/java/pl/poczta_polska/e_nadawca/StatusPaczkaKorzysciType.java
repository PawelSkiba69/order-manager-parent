
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for statusPaczkaKorzysciType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusPaczkaKorzysciType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ERROR"/&amp;gt;
 *     &amp;lt;enumeration value="NIEAKTYWNA"/&amp;gt;
 *     &amp;lt;enumeration value="AKTYWNA"/&amp;gt;
 *     &amp;lt;enumeration value="PRZETERMINOWANA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusPaczkaKorzysciType")
@XmlEnum
public enum StatusPaczkaKorzysciType {

    ERROR,
    NIEAKTYWNA,
    AKTYWNA,
    PRZETERMINOWANA;

    public String value() {
        return name();
    }

    public static StatusPaczkaKorzysciType fromValue(String v) {
        return valueOf(v);
    }

}
