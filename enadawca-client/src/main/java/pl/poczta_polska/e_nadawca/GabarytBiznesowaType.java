
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for gabarytBiznesowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="gabarytBiznesowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="XS"/&amp;gt;
 *     &amp;lt;enumeration value="S"/&amp;gt;
 *     &amp;lt;enumeration value="M"/&amp;gt;
 *     &amp;lt;enumeration value="L"/&amp;gt;
 *     &amp;lt;enumeration value="XL"/&amp;gt;
 *     &amp;lt;enumeration value="XXL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "gabarytBiznesowaType")
@XmlEnum
public enum GabarytBiznesowaType {

    XS,
    S,
    M,
    L,
    XL,
    XXL;

    public String value() {
        return name();
    }

    public static GabarytBiznesowaType fromValue(String v) {
        return valueOf(v);
    }

}
