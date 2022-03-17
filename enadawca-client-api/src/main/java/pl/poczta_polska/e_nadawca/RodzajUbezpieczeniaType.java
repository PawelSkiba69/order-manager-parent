
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rodzajUbezpieczeniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="rodzajUbezpieczeniaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="PRECJOZA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rodzajUbezpieczeniaType")
@XmlEnum
public enum RodzajUbezpieczeniaType {

    STANDARD,
    PRECJOZA;

    public String value() {
        return name();
    }

    public static RodzajUbezpieczeniaType fromValue(String v) {
        return valueOf(v);
    }

}
