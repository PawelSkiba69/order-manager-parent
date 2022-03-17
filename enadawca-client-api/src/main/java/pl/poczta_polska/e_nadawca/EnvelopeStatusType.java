
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for envelopeStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="envelopeStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WYSLANY"/&gt;
 *     &lt;enumeration value="DOSTARCZONY"/&gt;
 *     &lt;enumeration value="PRZYJETY"/&gt;
 *     &lt;enumeration value="WALIDOWANY"/&gt;
 *     &lt;enumeration value="BLEDNY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "envelopeStatusType")
@XmlEnum
public enum EnvelopeStatusType {

    WYSLANY,
    DOSTARCZONY,
    PRZYJETY,
    WALIDOWANY,
    BLEDNY;

    public String value() {
        return name();
    }

    public static EnvelopeStatusType fromValue(String v) {
        return valueOf(v);
    }

}
