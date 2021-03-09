
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for terminPaczkowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="terminPaczkowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_48"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_EKSTRA_24"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
