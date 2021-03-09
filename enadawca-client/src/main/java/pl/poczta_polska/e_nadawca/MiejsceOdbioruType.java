
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for miejsceOdbioruType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="miejsceOdbioruType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="NADAWCA"/&amp;gt;
 *     &amp;lt;enumeration value="URZAD_NADANIA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "miejsceOdbioruType")
@XmlEnum
public enum MiejsceOdbioruType {

    NADAWCA,
    URZAD_NADANIA;

    public String value() {
        return name();
    }

    public static MiejsceOdbioruType fromValue(String v) {
        return valueOf(v);
    }

}
