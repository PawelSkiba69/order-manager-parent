
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for typOplacaOdbiorcaEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="typOplacaOdbiorcaEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_INDYWIDUALNY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_UMOWNY"/&amp;gt;
 *     &amp;lt;enumeration value="ODDZIAL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "typOplacaOdbiorcaEnum")
@XmlEnum
public enum TypOplacaOdbiorcaEnum {

    ADRESAT_INDYWIDUALNY,
    ADRESAT_UMOWNY,
    ODDZIAL;

    public String value() {
        return name();
    }

    public static TypOplacaOdbiorcaEnum fromValue(String v) {
        return valueOf(v);
    }

}
