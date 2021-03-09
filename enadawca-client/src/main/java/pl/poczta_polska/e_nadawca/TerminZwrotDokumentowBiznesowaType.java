
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for terminZwrotDokumentowBiznesowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="terminZwrotDokumentowBiznesowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_EKONOMICZNY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_POLECONY_PRIORYTETOWY"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_POLECONY_EKONOMICZNY"/&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
