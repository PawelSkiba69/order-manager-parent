
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ZawartoscPrzesylkiZagranicznejEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ZawartoscPrzesylkiZagranicznejEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SPRZEDAZ_TOWARU"/&amp;gt;
 *     &amp;lt;enumeration value="ZWROT_TOWARU"/&amp;gt;
 *     &amp;lt;enumeration value="PREZENT"/&amp;gt;
 *     &amp;lt;enumeration value="PROBKA_HANDLOWA"/&amp;gt;
 *     &amp;lt;enumeration value="DOKUMENT"/&amp;gt;
 *     &amp;lt;enumeration value="INNE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
