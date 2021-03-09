
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for terminZwrotDokumentowKurierskaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="terminZwrotDokumentowKurierskaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/&amp;gt;
 *     &amp;lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/&amp;gt;
 *     &amp;lt;enumeration value="BEZPOSREDNI_DO_20KG"/&amp;gt;
 *     &amp;lt;enumeration value="EKSPRES24"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "terminZwrotDokumentowKurierskaType")
@XmlEnum
public enum TerminZwrotDokumentowKurierskaType {

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
    EKSPRES_24("EKSPRES24");
    private final String value;

    TerminZwrotDokumentowKurierskaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminZwrotDokumentowKurierskaType fromValue(String v) {
        for (TerminZwrotDokumentowKurierskaType c: TerminZwrotDokumentowKurierskaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
