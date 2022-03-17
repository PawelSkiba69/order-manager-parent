
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminZwrotDokumentowPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="terminZwrotDokumentowPaczkowaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PACZKA_24"/&gt;
 *     &lt;enumeration value="PACZKA_48"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
