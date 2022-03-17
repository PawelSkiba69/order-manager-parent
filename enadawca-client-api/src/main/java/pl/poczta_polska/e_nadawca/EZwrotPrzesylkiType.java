
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eZwrotPrzesylkiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="eZwrotPrzesylkiType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZWROTPACZKA48"/&gt;
 *     &lt;enumeration value="ZWROTKURIEREKSPRES24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eZwrotPrzesylkiType")
@XmlEnum
public enum EZwrotPrzesylkiType {

    @XmlEnumValue("ZWROTPACZKA48")
    ZWROTPACZKA_48("ZWROTPACZKA48"),
    @XmlEnumValue("ZWROTKURIEREKSPRES24")
    ZWROTKURIEREKSPRES_24("ZWROTKURIEREKSPRES24");
    private final String value;

    EZwrotPrzesylkiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EZwrotPrzesylkiType fromValue(String v) {
        for (EZwrotPrzesylkiType c: EZwrotPrzesylkiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
