
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for kategoriaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="kategoriaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EKONOMICZNA"/&amp;gt;
 *     &amp;lt;enumeration value="PRIORYTETOWA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "kategoriaType")
@XmlEnum
public enum KategoriaType {

    EKONOMICZNA,
    PRIORYTETOWA;

    public String value() {
        return name();
    }

    public static KategoriaType fromValue(String v) {
        return valueOf(v);
    }

}
