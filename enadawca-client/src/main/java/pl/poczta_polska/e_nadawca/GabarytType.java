
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for gabarytType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="gabarytType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="GABARYT_A"/&amp;gt;
 *     &amp;lt;enumeration value="GABARYT_B"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
