
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for zwrotDokumentowPaczkowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="zwrotDokumentowPaczkowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_EKSTRA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_48"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_EKONOMICZNY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_POLECONY_PRIORYTETOWY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_POLECONY_EKONOMICZNY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "zwrotDokumentowPaczkowaType")
@XmlEnum
public enum ZwrotDokumentowPaczkowaType {

    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    PACZKA_EKSTRA_24("PACZKA_EKSTRA_24"),
    PACZKA_24("PACZKA_24"),
    PACZKA_48("PACZKA_48"),
    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY"),
    LIST_ZWYKLY_EKONOMICZNY("LIST_ZWYKLY_EKONOMICZNY"),
    LIST_POLECONY_PRIORYTETOWY("LIST_POLECONY_PRIORYTETOWY"),
    LIST_POLECONY_EKONOMICZNY("LIST_POLECONY_EKONOMICZNY");
    private final String value;

    ZwrotDokumentowPaczkowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZwrotDokumentowPaczkowaType fromValue(String v) {
        for (ZwrotDokumentowPaczkowaType c: ZwrotDokumentowPaczkowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
