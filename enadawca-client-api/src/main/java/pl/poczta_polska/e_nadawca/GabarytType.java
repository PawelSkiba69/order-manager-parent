
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gabarytType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="gabarytType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GABARYT_A"/&gt;
 *     &lt;enumeration value="GABARYT_B"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gabarytType")
@XmlEnum
public enum GabarytType {

    GABARYT_A,
    GABARYT_B;

    public String value() {
        return name();
    }

    public static GabarytType fromValue(String v) {
        return valueOf(v);
    }

}
