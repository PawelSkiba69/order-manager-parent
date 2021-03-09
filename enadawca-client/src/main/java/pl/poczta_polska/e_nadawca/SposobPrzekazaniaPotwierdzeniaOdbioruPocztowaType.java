
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_EKSTRA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_48"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType")
@XmlEnum
public enum SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType {

    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    PACZKA_EKSTRA_24("PACZKA_EKSTRA_24"),
    PACZKA_24("PACZKA_24"),
    PACZKA_48("PACZKA_48"),
    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY");
    private final String value;

    SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType fromValue(String v) {
        for (SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType c: SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
