
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for statusEPOEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="statusEPOEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ERROR"/&amp;gt;
 *     &amp;lt;enumeration value="NADANIE"/&amp;gt;
 *     &amp;lt;enumeration value="W_TRANSPORCIE"/&amp;gt;
 *     &amp;lt;enumeration value="CLO"/&amp;gt;
 *     &amp;lt;enumeration value="SMS"/&amp;gt;
 *     &amp;lt;enumeration value="W_DORECZENIU"/&amp;gt;
 *     &amp;lt;enumeration value="AWIZO"/&amp;gt;
 *     &amp;lt;enumeration value="PONOWNE_AWIZO"/&amp;gt;
 *     &amp;lt;enumeration value="ZWROT"/&amp;gt;
 *     &amp;lt;enumeration value="DORECZONA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "statusEPOEnum")
@XmlEnum
public enum StatusEPOEnum {

    ERROR,
    NADANIE,
    W_TRANSPORCIE,
    CLO,
    SMS,
    W_DORECZENIU,
    AWIZO,
    PONOWNE_AWIZO,
    ZWROT,
    DORECZONA;

    public String value() {
        return name();
    }

    public static StatusEPOEnum fromValue(String v) {
        return valueOf(v);
    }

}
