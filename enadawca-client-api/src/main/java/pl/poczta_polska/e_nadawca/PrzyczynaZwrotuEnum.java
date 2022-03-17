
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przyczynaZwrotuEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="przyczynaZwrotuEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ODMOWA"/&gt;
 *     &lt;enumeration value="ADRESAT_ZMARL"/&gt;
 *     &lt;enumeration value="ADRESAT_NIEZNANY"/&gt;
 *     &lt;enumeration value="ADRESAT_WYPROWADZIL_SIE"/&gt;
 *     &lt;enumeration value="ADRESAT_NIE_PODJAL"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="ADRES_NIEPELNY"/&gt;
 *     &lt;enumeration value="ADRES_BLEDNY"/&gt;
 *     &lt;enumeration value="ADRES_NIEZGODNY"/&gt;
 *     &lt;enumeration value="ADRES_NIEZNALEZIONY"/&gt;
 *     &lt;enumeration value="ADRESAT_NIE_ZASTANO"/&gt;
 *     &lt;enumeration value="ADRESAT_NIE_ZGLASZA_SIE"/&gt;
 *     &lt;enumeration value="ADRESAT_NIEOBECNY"/&gt;
 *     &lt;enumeration value="ADRESAT_NIEODNALEZIONY"/&gt;
 *     &lt;enumeration value="ADRESAT_STRAJKUJE"/&gt;
 *     &lt;enumeration value="DO_NADAWCY_NA_POZNIEJ"/&gt;
 *     &lt;enumeration value="MYLNE_SKIEROWANIE"/&gt;
 *     &lt;enumeration value="NADAWCA_ODMOWIL"/&gt;
 *     &lt;enumeration value="NIE_PODJETO"/&gt;
 *     &lt;enumeration value="NIEZGODNE_WYMAGANIA"/&gt;
 *     &lt;enumeration value="ODMOWA_USZKODZENIA"/&gt;
 *     &lt;enumeration value="POBRANIE_NIEZGODNE"/&gt;
 *     &lt;enumeration value="USZKODZONA"/&gt;
 *     &lt;enumeration value="ZAMKNIETA_SIEDZIBA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
