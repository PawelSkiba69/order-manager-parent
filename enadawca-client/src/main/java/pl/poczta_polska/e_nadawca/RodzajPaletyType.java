
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for rodzajPaletyType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="rodzajPaletyType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EUR"/&amp;gt;
 *     &amp;lt;enumeration value="POLPALETA"/&amp;gt;
 *     &amp;lt;enumeration value="INNA"/&amp;gt;
 *     &amp;lt;enumeration value="PRZEMYSLOWA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "rodzajPaletyType")
@XmlEnum
public enum RodzajPaletyType {

    EUR,
    POLPALETA,
    INNA,
    PRZEMYSLOWA;

    public String value() {
        return name();
    }

    public static RodzajPaletyType fromValue(String v) {
        return valueOf(v);
    }

}
