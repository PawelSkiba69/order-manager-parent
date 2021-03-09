
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for podmiotDoreczeniaEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="podmiotDoreczeniaEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT"/&amp;gt;
 *     &amp;lt;enumeration value="PELNOLETNI_DOMOWNIK"/&amp;gt;
 *     &amp;lt;enumeration value="SASIAD"/&amp;gt;
 *     &amp;lt;enumeration value="DOZORCA_DOMU"/&amp;gt;
 *     &amp;lt;enumeration value="SOLTYS"/&amp;gt;
 *     &amp;lt;enumeration value="ADMINISTRACJA_DOMU"/&amp;gt;
 *     &amp;lt;enumeration value="UPOWAZNIONY_PRACOWNIK"/&amp;gt;
 *     &amp;lt;enumeration value="PELNOMOCNIK_POCZTOWY"/&amp;gt;
 *     &amp;lt;enumeration value="PRZEDSTAWICIEL_USTAWOWY"/&amp;gt;
 *     &amp;lt;enumeration value="PELNOMOCNIK_ADRESATA"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPRAWNIONA_DO_REPREZENTACJI"/&amp;gt;
 *     &amp;lt;enumeration value="SKRZYNKA_ODDAWCZA"/&amp;gt;
 *     &amp;lt;enumeration value="ADRESAT_KTORY_NIE_MOGL"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPRAWNIONA_DO_ODBIORU"/&amp;gt;
 *     &amp;lt;enumeration value="DOROSLY_DOMOWNIK"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPOWAZNIONA_DO_ODB_KORESP"/&amp;gt;
 *     &amp;lt;enumeration value="KIEROWNIK_JEDNOSTKI_LUB_UPOWAZNIONY"/&amp;gt;
 *     &amp;lt;enumeration value="PRZEDSTAWICIEL_ADRESATA"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPOWAZNIONA_DO_REPREZENT_ADRESATA"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_PRACODAWCE"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_ABW"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_AW"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_CBA"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_POLICJI"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_SC"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_SG"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_SKW"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_SW"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_SWW"/&amp;gt;
 *     &amp;lt;enumeration value="PRZELOZONY_ZOLNIERZA"/&amp;gt;
 *     &amp;lt;enumeration value="SKRYTKA_POCZTOWA"/&amp;gt;
 *     &amp;lt;enumeration value="PROKURENT"/&amp;gt;
 *     &amp;lt;enumeration value="ZARZADCA_DOMU"/&amp;gt;
 *     &amp;lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_KIER_WIEZIENIA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "podmiotDoreczeniaEnum")
@XmlEnum
public enum PodmiotDoreczeniaEnum {

    ADRESAT,
    PELNOLETNI_DOMOWNIK,
    SASIAD,
    DOZORCA_DOMU,
    SOLTYS,
    ADMINISTRACJA_DOMU,
    UPOWAZNIONY_PRACOWNIK,
    PELNOMOCNIK_POCZTOWY,
    PRZEDSTAWICIEL_USTAWOWY,
    PELNOMOCNIK_ADRESATA,
    OSOBA_UPRAWNIONA_DO_REPREZENTACJI,
    SKRZYNKA_ODDAWCZA,
    ADRESAT_KTORY_NIE_MOGL,
    OSOBA_UPRAWNIONA_DO_ODBIORU,
    DOROSLY_DOMOWNIK,
    OSOBA_UPOWAZNIONA_DO_ODB_KORESP,
    KIEROWNIK_JEDNOSTKI_LUB_UPOWAZNIONY,
    PRZEDSTAWICIEL_ADRESATA,
    OSOBA_UPOWAZNIONA_DO_REPREZENT_ADRESATA,
    OSOBA_UPOWAZNIONA_PRZEZ_PRACODAWCE,
    PRZELOZONY_ABW,
    PRZELOZONY_AW,
    PRZELOZONY_CBA,
    PRZELOZONY_POLICJI,
    PRZELOZONY_SC,
    PRZELOZONY_SG,
    PRZELOZONY_SKW,
    PRZELOZONY_SW,
    PRZELOZONY_SWW,
    PRZELOZONY_ZOLNIERZA,
    SKRYTKA_POCZTOWA,
    PROKURENT,
    ZARZADCA_DOMU,
    OSOBA_UPOWAZNIONA_PRZEZ_KIER_WIEZIENIA;

    public String value() {
        return name();
    }

    public static PodmiotDoreczeniaEnum fromValue(String v) {
        return valueOf(v);
    }

}
