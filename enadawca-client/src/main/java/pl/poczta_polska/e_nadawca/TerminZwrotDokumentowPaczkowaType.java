
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for terminZwrotDokumentowPaczkowaType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="terminZwrotDokumentowPaczkowaType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_24"/&amp;gt;
 *     &amp;lt;enumeration value="PACZKA_48"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "terminZwrotDokumentowPaczkowaType")
@XmlEnum
public enum TerminZwrotDokumentowPaczkowaType {

    PACZKA_24,
    PACZKA_48;

    public String value() {
        return name();
    }

    public static TerminZwrotDokumentowPaczkowaType fromValue(String v) {
        return valueOf(v);
    }

}
