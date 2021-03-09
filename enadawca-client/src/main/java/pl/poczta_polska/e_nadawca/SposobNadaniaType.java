
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobNadaniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobNadaniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="WERYFIKACJA_WEZEL_DOCELOWY"/&amp;gt;
 *     &amp;lt;enumeration value="WERYFIKACJA_WEZEL_NADAWCZY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobNadaniaType")
@XmlEnum
public enum SposobNadaniaType {

    WERYFIKACJA_WEZEL_DOCELOWY,
    WERYFIKACJA_WEZEL_NADAWCZY;

    public String value() {
        return name();
    }

    public static SposobNadaniaType fromValue(String v) {
        return valueOf(v);
    }

}
