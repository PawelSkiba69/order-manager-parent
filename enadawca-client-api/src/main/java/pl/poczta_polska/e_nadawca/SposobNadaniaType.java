
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobNadaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="sposobNadaniaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WERYFIKACJA_WEZEL_DOCELOWY"/&gt;
 *     &lt;enumeration value="WERYFIKACJA_WEZEL_NADAWCZY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
