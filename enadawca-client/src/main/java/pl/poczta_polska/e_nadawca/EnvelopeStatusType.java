
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for envelopeStatusType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="envelopeStatusType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="WYSLANY"/&amp;gt;
 *     &amp;lt;enumeration value="DOSTARCZONY"/&amp;gt;
 *     &amp;lt;enumeration value="PRZYJETY"/&amp;gt;
 *     &amp;lt;enumeration value="WALIDOWANY"/&amp;gt;
 *     &amp;lt;enumeration value="BLEDNY"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
