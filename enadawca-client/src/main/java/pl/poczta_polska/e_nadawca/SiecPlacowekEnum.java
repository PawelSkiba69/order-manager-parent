
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for siecPlacowekEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="siecPlacowekEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="POCZTAPOLSKA"/&amp;gt;
 *     &amp;lt;enumeration value="ORLEN"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "siecPlacowekEnum")
@XmlEnum
public enum SiecPlacowekEnum {

    POCZTAPOLSKA,
    ORLEN;

    public String value() {
        return name();
    }

    public static SiecPlacowekEnum fromValue(String v) {
        return valueOf(v);
    }

}
