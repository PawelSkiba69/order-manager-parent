
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for DeklaracaCelnaRodzajEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="DeklaracaCelnaRodzajEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="CN22"/&amp;gt;
 *     &amp;lt;enumeration value="CN23"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "DeklaracaCelnaRodzajEnum")
@XmlEnum
public enum DeklaracaCelnaRodzajEnum {

    @XmlEnumValue("CN22")
    CN_22("CN22"),
    @XmlEnumValue("CN23")
    CN_23("CN23");
    private final String value;

    DeklaracaCelnaRodzajEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeklaracaCelnaRodzajEnum fromValue(String v) {
        for (DeklaracaCelnaRodzajEnum c: DeklaracaCelnaRodzajEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
