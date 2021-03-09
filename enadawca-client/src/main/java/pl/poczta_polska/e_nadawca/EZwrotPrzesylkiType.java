
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for eZwrotPrzesylkiType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="eZwrotPrzesylkiType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ZWROTPACZKA48"/&amp;gt;
 *     &amp;lt;enumeration value="ZWROTKURIEREKSPRES24"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
