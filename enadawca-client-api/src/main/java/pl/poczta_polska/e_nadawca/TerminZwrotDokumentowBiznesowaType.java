
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminZwrotDokumentowBiznesowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminZwrotDokumentowBiznesowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&gt;
 *     &lt;enumeration value="LIST_ZWYKLY_EKONOMICZNY"/&gt;
 *     &lt;enumeration value="LIST_POLECONY_PRIORYTETOWY"/&gt;
 *     &lt;enumeration value="LIST_POLECONY_EKONOMICZNY"/&gt;
 *     &lt;enumeration value="EKSPRES24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "terminZwrotDokumentowBiznesowaType")
@XmlEnum
public enum TerminZwrotDokumentowBiznesowaType {

    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY"),
    LIST_ZWYKLY_EKONOMICZNY("LIST_ZWYKLY_EKONOMICZNY"),
    LIST_POLECONY_PRIORYTETOWY("LIST_POLECONY_PRIORYTETOWY"),
    LIST_POLECONY_EKONOMICZNY("LIST_POLECONY_EKONOMICZNY"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24");
    private final String value;

    TerminZwrotDokumentowBiznesowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminZwrotDokumentowBiznesowaType fromValue(String v) {
        for (TerminZwrotDokumentowBiznesowaType c: TerminZwrotDokumentowBiznesowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
