
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminPaczkowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACZKA_24"/&gt;
 *     &lt;enumeration value="PACZKA_48"/&gt;
 *     &lt;enumeration value="PACZKA_EKSTRA_24"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "terminPaczkowaType")
@XmlEnum
public enum TerminPaczkowaType {

    PACZKA_24,
    PACZKA_48,
    PACZKA_EKSTRA_24;

    public String value() {
        return name();
    }

    public static TerminPaczkowaType fromValue(String v) {
        return valueOf(v);
    }

}
