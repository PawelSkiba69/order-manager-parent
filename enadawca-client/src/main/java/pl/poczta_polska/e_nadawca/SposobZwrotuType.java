
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobZwrotuType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobZwrotuType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LADOWO_MORSKA"/&gt;
 *     &lt;enumeration value="LOTNICZA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sposobZwrotuType")
@XmlEnum
public enum SposobZwrotuType {

    LADOWO_MORSKA,
    LOTNICZA;

    public String value() {
        return name();
    }

    public static SposobZwrotuType fromValue(String v) {
        return valueOf(v);
    }

}
