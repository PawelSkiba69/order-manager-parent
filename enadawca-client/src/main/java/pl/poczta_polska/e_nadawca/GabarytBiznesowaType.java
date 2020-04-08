
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gabarytBiznesowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gabarytBiznesowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XS"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="XL"/&gt;
 *     &lt;enumeration value="XXL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
