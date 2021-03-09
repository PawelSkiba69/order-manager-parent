
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for przyczynaZwrotuEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="przyczynaZwrotuEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ODMOWA"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_ZMARL"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIEZNANY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_WYPROWADZIL_SIE"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIE_PODJAL"/&amp;gt;
 *     &amp;lt;enumeration value="INNA"/&amp;gt;
 *     &amp;lt;enumeration value="ADRES_NIEPELNY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRES_BLEDNY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRES_NIEZGODNY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRES_NIEZNALEZIONY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIE_ZASTANO"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIE_ZGLASZA_SIE"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIEOBECNY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_NIEODNALEZIONY"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_STRAJKUJE"/&amp;gt;
 *     &amp;lt;enumeration value="DO_NADAWCY_NA_POZNIEJ"/&amp;gt;
 *     &amp;lt;enumeration value="MYLNE_SKIEROWANIE"/&amp;gt;
 *     &amp;lt;enumeration value="NADAWCA_ODMOWIL"/&amp;gt;
 *     &amp;lt;enumeration value="NIE_PODJETO"/&amp;gt;
 *     &amp;lt;enumeration value="NIEZGODNE_WYMAGANIA"/&amp;gt;
 *     &amp;lt;enumeration value="ODMOWA_USZKODZENIA"/&amp;gt;
 *     &amp;lt;enumeration value="POBRANIE_NIEZGODNE"/&amp;gt;
 *     &amp;lt;enumeration value="USZKODZONA"/&amp;gt;
 *     &amp;lt;enumeration value="ZAMKNIETA_SIEDZIBA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "przyczynaZwrotuEnum")
@XmlEnum
public enum PrzyczynaZwrotuEnum {

    ODMOWA,
    ADRESAT_ZMARL,
    ADRESAT_NIEZNANY,
    ADRESAT_WYPROWADZIL_SIE,
    ADRESAT_NIE_PODJAL,
    INNA,
    ADRES_NIEPELNY,
    ADRES_BLEDNY,
    ADRES_NIEZGODNY,
    ADRES_NIEZNALEZIONY,
    ADRESAT_NIE_ZASTANO,
    ADRESAT_NIE_ZGLASZA_SIE,
    ADRESAT_NIEOBECNY,
    ADRESAT_NIEODNALEZIONY,
    ADRESAT_STRAJKUJE,
    DO_NADAWCY_NA_POZNIEJ,
    MYLNE_SKIEROWANIE,
    NADAWCA_ODMOWIL,
    NIE_PODJETO,
    NIEZGODNE_WYMAGANIA,
    ODMOWA_USZKODZENIA,
    POBRANIE_NIEZGODNE,
    USZKODZONA,
    ZAMKNIETA_SIEDZIBA;

    public String value() {
        return name();
    }

    public static PrzyczynaZwrotuEnum fromValue(String v) {
        return valueOf(v);
    }

}
