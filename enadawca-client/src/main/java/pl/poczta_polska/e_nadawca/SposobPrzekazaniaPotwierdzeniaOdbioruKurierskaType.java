
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/&amp;gt;
 *     &amp;lt;enumeration value="BEZPOSREDNI_DO_20KG"/&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_48"/&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType")
@XmlEnum
public enum SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType {

    @XmlEnumValue("MIEJSKI_DO_3H_DO_5KM")
    MIEJSKI_DO_3_H_DO_5_KM("MIEJSKI_DO_3H_DO_5KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_10KM")
    MIEJSKI_DO_3_H_DO_10_KM("MIEJSKI_DO_3H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_15KM")
    MIEJSKI_DO_3_H_DO_15_KM("MIEJSKI_DO_3H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_POWYZEJ_15KM")
    MIEJSKI_DO_3_H_POWYZEJ_15_KM("MIEJSKI_DO_3H_POWYZEJ_15KM"),
    @XmlEnumValue("BEZPOSREDNI_DO_20KG")
    BEZPOSREDNI_DO_20_KG("BEZPOSREDNI_DO_20KG"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    PACZKA_24("PACZKA_24"),
    PACZKA_48("PACZKA_48"),
    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY");
    private final String value;

    SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType fromValue(String v) {
        for (SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType c: SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
