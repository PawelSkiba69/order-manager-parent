
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminKurierskaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminKurierskaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_10KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_15KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_20KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_30KM"/&gt;
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_40KM"/&gt;
 *     &lt;enumeration value="KRAJOWY"/&gt;
 *     &lt;enumeration value="BEZPOSREDNI_DO_20KG"/&gt;
 *     &lt;enumeration value="BEZPOSREDNI_OD_20KG_DO_30KG"/&gt;
 *     &lt;enumeration value="BEZPOSREDNI_OD_30KG_DO_100KG"/&gt;
 *     &lt;enumeration value="EKSPRES24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "terminKurierskaType")
@XmlEnum
public enum TerminKurierskaType {

    @XmlEnumValue("MIEJSKI_DO_3H_DO_5KM")
    MIEJSKI_DO_3_H_DO_5_KM("MIEJSKI_DO_3H_DO_5KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_10KM")
    MIEJSKI_DO_3_H_DO_10_KM("MIEJSKI_DO_3H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_15KM")
    MIEJSKI_DO_3_H_DO_15_KM("MIEJSKI_DO_3H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_POWYZEJ_15KM")
    MIEJSKI_DO_3_H_POWYZEJ_15_KM("MIEJSKI_DO_3H_POWYZEJ_15KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_10KM")
    MIEJSKI_DO_4_H_DO_10_KM("MIEJSKI_DO_4H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_15KM")
    MIEJSKI_DO_4_H_DO_15_KM("MIEJSKI_DO_4H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_20KM")
    MIEJSKI_DO_4_H_DO_20_KM("MIEJSKI_DO_4H_DO_20KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_30KM")
    MIEJSKI_DO_4_H_DO_30_KM("MIEJSKI_DO_4H_DO_30KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_40KM")
    MIEJSKI_DO_4_H_DO_40_KM("MIEJSKI_DO_4H_DO_40KM"),
    KRAJOWY("KRAJOWY"),
    @XmlEnumValue("BEZPOSREDNI_DO_20KG")
    BEZPOSREDNI_DO_20_KG("BEZPOSREDNI_DO_20KG"),
    @XmlEnumValue("BEZPOSREDNI_OD_20KG_DO_30KG")
    BEZPOSREDNI_OD_20_KG_DO_30_KG("BEZPOSREDNI_OD_20KG_DO_30KG"),
    @XmlEnumValue("BEZPOSREDNI_OD_30KG_DO_100KG")
    BEZPOSREDNI_OD_30_KG_DO_100_KG("BEZPOSREDNI_OD_30KG_DO_100KG"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24");
    private final String value;

    TerminKurierskaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TerminKurierskaType fromValue(String v) {
        for (TerminKurierskaType c: TerminKurierskaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
