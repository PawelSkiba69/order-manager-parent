
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusPaczkaKorzysciType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="statusPaczkaKorzysciType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NIEAKTYWNA"/&gt;
 *     &lt;enumeration value="AKTYWNA"/&gt;
 *     &lt;enumeration value="PRZETERMINOWANA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
