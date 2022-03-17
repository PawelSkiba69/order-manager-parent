
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kategoriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="kategoriaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EKONOMICZNA"/&gt;
 *     &lt;enumeration value="PRIORYTETOWA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kategoriaType")
@XmlEnum
public enum KategoriaType {

    EKONOMICZNA,
    PRIORYTETOWA;

    public String value() {
        return name();
    }

    public static KategoriaType fromValue(String v) {
        return valueOf(v);
    }

}
