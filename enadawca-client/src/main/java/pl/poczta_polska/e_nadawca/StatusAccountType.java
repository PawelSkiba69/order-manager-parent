
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for statusAccountType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusAccountType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="WYLACZONY"/&amp;gt;
 *     &amp;lt;enumeration value="ZABLOKOWANY"/&amp;gt;
 *     &amp;lt;enumeration value="ODBLOKOWANY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusAccountType")
@XmlEnum
public enum StatusAccountType {

    WYLACZONY,
    ZABLOKOWANY,
    ODBLOKOWANY;

    public String value() {
        return name();
    }

    public static StatusAccountType fromValue(String v) {
        return valueOf(v);
    }

}
