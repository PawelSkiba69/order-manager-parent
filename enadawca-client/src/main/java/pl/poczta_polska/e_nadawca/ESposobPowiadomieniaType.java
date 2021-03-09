
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for eSposobPowiadomieniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="eSposobPowiadomieniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SMS"/&amp;gt;
 *     &amp;lt;enumeration value="EMAIL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "eSposobPowiadomieniaType")
@XmlEnum
public enum ESposobPowiadomieniaType {

    SMS,
    EMAIL;

    public String value() {
        return name();
    }

    public static ESposobPowiadomieniaType fromValue(String v) {
        return valueOf(v);
    }

}
