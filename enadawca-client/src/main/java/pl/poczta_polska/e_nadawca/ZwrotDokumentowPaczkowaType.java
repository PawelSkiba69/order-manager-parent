
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zwrotDokumentowPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zwrotDokumentowPaczkowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EKSPRES24"/&gt;
 *     &lt;enumeration value="PACZKA_EKSTRA_24"/&gt;
 *     &lt;enumeration value="PACZKA_24"/&gt;
 *     &lt;enumeration value="PACZKA_48"/&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_EKONOMICZNY"/&gt;
 *     &lt;enumeration value="LIST_POLECONY_PRIORYTETOWY"/&gt;
 *     &lt;enumeration value="LIST_POLECONY_EKONOMICZNY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
