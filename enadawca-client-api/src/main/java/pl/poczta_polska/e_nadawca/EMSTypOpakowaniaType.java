
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMSTypOpakowaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EMSTypOpakowaniaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZWYKLY"/&gt;
 *     &lt;enumeration value="DOKUMENT_PACK"/&gt;
 *     &lt;enumeration value="KILO_PACK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EMSTypOpakowaniaType")
@XmlEnum
public enum EMSTypOpakowaniaType {

    ZWYKLY,
    DOKUMENT_PACK,
    KILO_PACK;

    public String value() {
        return name();
    }

    public static EMSTypOpakowaniaType fromValue(String v) {
        return valueOf(v);
    }

}
