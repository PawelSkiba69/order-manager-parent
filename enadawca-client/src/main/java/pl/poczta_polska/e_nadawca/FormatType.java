
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for formatType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="formatType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="S"/&amp;gt;
 *     &amp;lt;enumeration value="M"/&amp;gt;
 *     &amp;lt;enumeration value="L"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "formatType")
@XmlEnum
public enum FormatType {

    S,
    M,
    L;

    public String value() {
        return name();
    }

    public static FormatType fromValue(String v) {
        return valueOf(v);
    }

}
