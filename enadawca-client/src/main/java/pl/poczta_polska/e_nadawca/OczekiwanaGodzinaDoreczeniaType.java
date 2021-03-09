
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for oczekiwanaGodzinaDoreczeniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="oczekiwanaGodzinaDoreczeniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="DO 08:00"/&amp;gt;
 *     &amp;lt;enumeration value="DO 09:00"/&amp;gt;
 *     &amp;lt;enumeration value="DO 12:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 13:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 14:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 15:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 16:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 17:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 18:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 19:00"/&amp;gt;
 *     &amp;lt;enumeration value="NA 20:00"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "oczekiwanaGodzinaDoreczeniaType")
@XmlEnum
public enum OczekiwanaGodzinaDoreczeniaType {

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
    NA_20_00("NA 20:00");
    private final String value;

    OczekiwanaGodzinaDoreczeniaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OczekiwanaGodzinaDoreczeniaType fromValue(String v) {
        for (OczekiwanaGodzinaDoreczeniaType c: OczekiwanaGodzinaDoreczeniaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
