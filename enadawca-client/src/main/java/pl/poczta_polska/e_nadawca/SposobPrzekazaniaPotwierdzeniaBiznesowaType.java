
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobPrzekazaniaPotwierdzeniaBiznesowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobPrzekazaniaPotwierdzeniaBiznesowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
