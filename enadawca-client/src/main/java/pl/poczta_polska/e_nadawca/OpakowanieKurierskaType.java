
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for opakowanieKurierskaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="opakowanieKurierskaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="FIRMOWA_DO_1KG"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "opakowanieKurierskaType")
@XmlEnum
public enum OpakowanieKurierskaType {

    @XmlEnumValue("FIRMOWA_DO_1KG")
    FIRMOWA_DO_1_KG("FIRMOWA_DO_1KG");
    private final String value;

    OpakowanieKurierskaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpakowanieKurierskaType fromValue(String v) {
        for (OpakowanieKurierskaType c: OpakowanieKurierskaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
