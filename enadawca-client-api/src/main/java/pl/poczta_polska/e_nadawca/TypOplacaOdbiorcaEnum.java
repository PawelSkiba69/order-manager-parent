
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typOplacaOdbiorcaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="typOplacaOdbiorcaEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADRESAT_INDYWIDUALNY"/&gt;
 *     &lt;enumeration value="ADRESAT_UMOWNY"/&gt;
 *     &lt;enumeration value="ODDZIAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
