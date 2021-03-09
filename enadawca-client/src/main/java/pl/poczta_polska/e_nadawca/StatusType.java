
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for statusType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NIEPOTWIERDZONA"/&amp;gt;
 *     &amp;lt;enumeration value="POTWIERDZONA"/&amp;gt;
 *     &amp;lt;enumeration value="NOWA"/&amp;gt;
 *     &amp;lt;enumeration value="BRAK"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    NIEPOTWIERDZONA,
    POTWIERDZONA,
    NOWA,
    BRAK;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
