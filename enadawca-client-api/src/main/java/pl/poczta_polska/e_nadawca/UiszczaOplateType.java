
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uiszczaOplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="uiszczaOplateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NADAWCA"/&gt;
 *     &lt;enumeration value="ADRESAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "uiszczaOplateType")
@XmlEnum
public enum UiszczaOplateType {

    NADAWCA,
    ADRESAT;

    public String value() {
        return name();
    }

    public static UiszczaOplateType fromValue(String v) {
        return valueOf(v);
    }

}
