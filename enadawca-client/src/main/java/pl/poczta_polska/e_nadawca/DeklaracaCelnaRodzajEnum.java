
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeklaracaCelnaRodzajEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeklaracaCelnaRodzajEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CN22"/&gt;
 *     &lt;enumeration value="CN23"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
