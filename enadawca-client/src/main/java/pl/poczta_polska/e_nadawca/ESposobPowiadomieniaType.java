
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSposobPowiadomieniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSposobPowiadomieniaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
