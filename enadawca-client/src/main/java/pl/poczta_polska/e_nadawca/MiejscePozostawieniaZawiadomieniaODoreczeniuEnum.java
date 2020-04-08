
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miejscePozostawieniaZawiadomieniaODoreczeniuEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="miejscePozostawieniaZawiadomieniaODoreczeniuEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SKRZYNKA_ADRESATA"/&gt;
 *     &lt;enumeration value="DRZWI_MIESZKANIA"/&gt;
 *     &lt;enumeration value="INNE_WIDOCZNE_MIEJSCE"/&gt;
 *     &lt;enumeration value="SKRYTKA_POCZTOWA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
