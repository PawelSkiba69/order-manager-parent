
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobPobraniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobPobraniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PRZEKAZ"/&amp;gt;
 *     &amp;lt;enumeration value="RACHUNEK_BANKOWY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobPobraniaType")
@XmlEnum
public enum SposobPobraniaType {

    PRZEKAZ,
    RACHUNEK_BANKOWY;

    public String value() {
        return name();
    }

    public static SposobPobraniaType fromValue(String v) {
        return valueOf(v);
    }

}
