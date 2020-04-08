
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZawartoscPrzesylkiZagranicznejEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZawartoscPrzesylkiZagranicznejEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SPRZEDAZ_TOWARU"/&gt;
 *     &lt;enumeration value="ZWROT_TOWARU"/&gt;
 *     &lt;enumeration value="PREZENT"/&gt;
 *     &lt;enumeration value="PROBKA_HANDLOWA"/&gt;
 *     &lt;enumeration value="DOKUMENT"/&gt;
 *     &lt;enumeration value="INNE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ZawartoscPrzesylkiZagranicznejEnum")
@XmlEnum
public enum ZawartoscPrzesylkiZagranicznejEnum {

    SPRZEDAZ_TOWARU,
    ZWROT_TOWARU,
    PREZENT,
    PROBKA_HANDLOWA,
    DOKUMENT,
    INNE;

    public String value() {
        return name();
    }

    public static ZawartoscPrzesylkiZagranicznejEnum fromValue(String v) {
        return valueOf(v);
    }

}
