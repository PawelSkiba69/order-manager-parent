
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminZwrotDokumentowKurierskaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminZwrotDokumentowKurierskaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/&gt;
 *     &lt;enumeration value="BEZPOSREDNI_DO_20KG"/&gt;
 *     &lt;enumeration value="EKSPRES24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
