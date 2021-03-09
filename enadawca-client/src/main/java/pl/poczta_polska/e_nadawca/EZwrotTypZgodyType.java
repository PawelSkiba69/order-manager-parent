
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for eZwrotTypZgodyType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="eZwrotTypZgodyType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ZGODA_BRAK"/&amp;gt;
 *     &amp;lt;enumeration value="ZGODA_AUTOMATYCZNA"/&amp;gt;
 *     &amp;lt;enumeration value="ZGODA_INDYWIDUALNA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "eZwrotTypZgodyType")
@XmlEnum
public enum EZwrotTypZgodyType {

    ZGODA_BRAK,
    ZGODA_AUTOMATYCZNA,
    ZGODA_INDYWIDUALNA;

    public String value() {
        return name();
    }

    public static EZwrotTypZgodyType fromValue(String v) {
        return valueOf(v);
    }

}
