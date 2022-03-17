
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oczekiwanaGodzinaDoreczeniaUslugiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="oczekiwanaGodzinaDoreczeniaUslugiType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DO 08:00"/&gt;
 *     &lt;enumeration value="DO 09:00"/&gt;
 *     &lt;enumeration value="DO 12:00"/&gt;
 *     &lt;enumeration value="NA 13:00"/&gt;
 *     &lt;enumeration value="NA 14:00"/&gt;
 *     &lt;enumeration value="NA 15:00"/&gt;
 *     &lt;enumeration value="NA 16:00"/&gt;
 *     &lt;enumeration value="NA 17:00"/&gt;
 *     &lt;enumeration value="NA 18:00"/&gt;
 *     &lt;enumeration value="NA 19:00"/&gt;
 *     &lt;enumeration value="NA 20:00"/&gt;
 *     &lt;enumeration value="PO 17:00"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "oczekiwanaGodzinaDoreczeniaUslugiType")
@XmlEnum
public enum OczekiwanaGodzinaDoreczeniaUslugiType {

    @XmlEnumValue("DO 08:00")
    DO_08_00("DO 08:00"),
    @XmlEnumValue("DO 09:00")
    DO_09_00("DO 09:00"),
    @XmlEnumValue("DO 12:00")
    DO_12_00("DO 12:00"),
    @XmlEnumValue("NA 13:00")
    NA_13_00("NA 13:00"),
    @XmlEnumValue("NA 14:00")
    NA_14_00("NA 14:00"),
    @XmlEnumValue("NA 15:00")
    NA_15_00("NA 15:00"),
    @XmlEnumValue("NA 16:00")
    NA_16_00("NA 16:00"),
    @XmlEnumValue("NA 17:00")
    NA_17_00("NA 17:00"),
    @XmlEnumValue("NA 18:00")
    NA_18_00("NA 18:00"),
    @XmlEnumValue("NA 19:00")
    NA_19_00("NA 19:00"),
    @XmlEnumValue("NA 20:00")
    NA_20_00("NA 20:00"),
    @XmlEnumValue("PO 17:00")
    PO_17_00("PO 17:00");
    private final String value;

    OczekiwanaGodzinaDoreczeniaUslugiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OczekiwanaGodzinaDoreczeniaUslugiType fromValue(String v) {
        for (OczekiwanaGodzinaDoreczeniaUslugiType c: OczekiwanaGodzinaDoreczeniaUslugiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
