
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for miejscePozostawieniaZawiadomieniaODoreczeniuEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="miejscePozostawieniaZawiadomieniaODoreczeniuEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SKRZYNKA_ADRESATA"/&amp;gt;
 *     &amp;lt;enumeration value="DRZWI_MIESZKANIA"/&amp;gt;
 *     &amp;lt;enumeration value="INNE_WIDOCZNE_MIEJSCE"/&amp;gt;
 *     &amp;lt;enumeration value="SKRYTKA_POCZTOWA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "miejscePozostawieniaZawiadomieniaODoreczeniuEnum")
@XmlEnum
public enum MiejscePozostawieniaZawiadomieniaODoreczeniuEnum {

    SKRZYNKA_ADRESATA,
    DRZWI_MIESZKANIA,
    INNE_WIDOCZNE_MIEJSCE,
    SKRYTKA_POCZTOWA;

    public String value() {
        return name();
    }

    public static MiejscePozostawieniaZawiadomieniaODoreczeniuEnum fromValue(String v) {
        return valueOf(v);
    }

}
