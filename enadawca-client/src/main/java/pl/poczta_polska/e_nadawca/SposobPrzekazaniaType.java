
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sposobPrzekazaniaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="sposobPrzekazaniaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="LIST_ZWYKLY_PRIOTYTET"/&amp;gt;
 *     &amp;lt;enumeration value="POCZTEX"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "sposobPrzekazaniaType")
@XmlEnum
public enum SposobPrzekazaniaType {

    LIST_ZWYKLY_PRIOTYTET,
    POCZTEX;

    public String value() {
        return name();
    }

    public static SposobPrzekazaniaType fromValue(String v) {
        return valueOf(v);
    }

}
