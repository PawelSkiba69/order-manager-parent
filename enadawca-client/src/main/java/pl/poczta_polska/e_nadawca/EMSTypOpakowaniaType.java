
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EMSTypOpakowaniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EMSTypOpakowaniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ZWYKLY"/&amp;gt;
 *     &amp;lt;enumeration value="DOKUMENT_PACK"/&amp;gt;
 *     &amp;lt;enumeration value="KILO_PACK"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
