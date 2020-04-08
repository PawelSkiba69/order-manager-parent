
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rodzajPaletyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rodzajPaletyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="POLPALETA"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="PRZEMYSLOWA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rodzajPaletyType")
@XmlEnum
public enum RodzajPaletyType {

    EUR,
    POLPALETA,
    INNA,
    PRZEMYSLOWA;

    public String value() {
        return name();
    }

    public static RodzajPaletyType fromValue(String v) {
        return valueOf(v);
    }

}
