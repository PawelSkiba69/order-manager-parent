
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for uiszczaOplateType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="uiszczaOplateType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NADAWCA"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "uiszczaOplateType")
@XmlEnum
public enum UiszczaOplateType {

    NADAWCA,
    ADRESAT;

    public String value() {
        return name();
    }

    public static UiszczaOplateType fromValue(String v) {
        return valueOf(v);
    }

}
