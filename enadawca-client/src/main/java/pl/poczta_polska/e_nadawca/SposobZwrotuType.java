
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobZwrotuType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobZwrotuType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LADOWO_MORSKA"/&amp;gt;
 *     &amp;lt;enumeration value="LOTNICZA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobZwrotuType")
@XmlEnum
public enum SposobZwrotuType {

    LADOWO_MORSKA,
    LOTNICZA;

    public String value() {
        return name();
    }

    public static SposobZwrotuType fromValue(String v) {
        return valueOf(v);
    }

}
