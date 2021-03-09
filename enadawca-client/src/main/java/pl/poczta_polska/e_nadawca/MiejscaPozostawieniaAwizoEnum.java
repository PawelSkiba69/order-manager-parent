
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for miejscaPozostawieniaAwizoEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="miejscaPozostawieniaAwizoEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SKRZYNKA_ODDAWCZA"/&amp;gt;
 *     &amp;lt;enumeration value="DRZWI_MIESZKANIA"/&amp;gt;
 *     &amp;lt;enumeration value="DRZWI_INNEGO_POMIESZCZENIA"/&amp;gt;
 *     &amp;lt;enumeration value="PRZY_WEJSCIU_NA_POSESJE"/&amp;gt;
 *     &amp;lt;enumeration value="SKRYTKA_POCZTOWA"/&amp;gt;
 *     &amp;lt;enumeration value="INNE_WIDOCZNE_MIEJSCE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "miejscaPozostawieniaAwizoEnum")
@XmlEnum
public enum MiejscaPozostawieniaAwizoEnum {

    SKRZYNKA_ODDAWCZA,
    DRZWI_MIESZKANIA,
    DRZWI_INNEGO_POMIESZCZENIA,
    PRZY_WEJSCIU_NA_POSESJE,
    SKRYTKA_POCZTOWA,
    INNE_WIDOCZNE_MIEJSCE;

    public String value() {
        return name();
    }

    public static MiejscaPozostawieniaAwizoEnum fromValue(String v) {
        return valueOf(v);
    }

}
