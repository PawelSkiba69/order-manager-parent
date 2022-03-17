
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPrzekazaniaPotwierdzeniaBiznesowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="sposobPrzekazaniaPotwierdzeniaBiznesowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&gt;
 *     &lt;enumeration value="EKSPRES24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sposobPrzekazaniaPotwierdzeniaBiznesowaType")
@XmlEnum
public enum SposobPrzekazaniaPotwierdzeniaBiznesowaType {

    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24");
    private final String value;

    SposobPrzekazaniaPotwierdzeniaBiznesowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SposobPrzekazaniaPotwierdzeniaBiznesowaType fromValue(String v) {
        for (SposobPrzekazaniaPotwierdzeniaBiznesowaType c: SposobPrzekazaniaPotwierdzeniaBiznesowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
