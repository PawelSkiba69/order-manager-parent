
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for podmiotDoreczeniaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="podmiotDoreczeniaEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADRESAT"/&gt;
 *     &lt;enumeration value="PELNOLETNI_DOMOWNIK"/&gt;
 *     &lt;enumeration value="SASIAD"/&gt;
 *     &lt;enumeration value="DOZORCA_DOMU"/&gt;
 *     &lt;enumeration value="SOLTYS"/&gt;
 *     &lt;enumeration value="ADMINISTRACJA_DOMU"/&gt;
 *     &lt;enumeration value="UPOWAZNIONY_PRACOWNIK"/&gt;
 *     &lt;enumeration value="PELNOMOCNIK_POCZTOWY"/&gt;
 *     &lt;enumeration value="PRZEDSTAWICIEL_USTAWOWY"/&gt;
 *     &lt;enumeration value="PELNOMOCNIK_ADRESATA"/&gt;
 *     &lt;enumeration value="OSOBA_UPRAWNIONA_DO_REPREZENTACJI"/&gt;
 *     &lt;enumeration value="SKRZYNKA_ODDAWCZA"/&gt;
 *     &lt;enumeration value="ADRESAT_KTORY_NIE_MOGL"/&gt;
 *     &lt;enumeration value="OSOBA_UPRAWNIONA_DO_ODBIORU"/&gt;
 *     &lt;enumeration value="DOROSLY_DOMOWNIK"/&gt;
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_DO_ODB_KORESP"/&gt;
 *     &lt;enumeration value="KIEROWNIK_JEDNOSTKI_LUB_UPOWAZNIONY"/&gt;
 *     &lt;enumeration value="PRZEDSTAWICIEL_ADRESATA"/&gt;
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_DO_REPREZENT_ADRESATA"/&gt;
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_PRACODAWCE"/&gt;
 *     &lt;enumeration value="PRZELOZONY_ABW"/&gt;
 *     &lt;enumeration value="PRZELOZONY_AW"/&gt;
 *     &lt;enumeration value="PRZELOZONY_CBA"/&gt;
 *     &lt;enumeration value="PRZELOZONY_POLICJI"/&gt;
 *     &lt;enumeration value="PRZELOZONY_SC"/&gt;
 *     &lt;enumeration value="PRZELOZONY_SG"/&gt;
 *     &lt;enumeration value="PRZELOZONY_SKW"/&gt;
 *     &lt;enumeration value="PRZELOZONY_SW"/&gt;
 *     &lt;enumeration value="PRZELOZONY_SWW"/&gt;
 *     &lt;enumeration value="PRZELOZONY_ZOLNIERZA"/&gt;
 *     &lt;enumeration value="SKRYTKA_POCZTOWA"/&gt;
 *     &lt;enumeration value="PROKURENT"/&gt;
 *     &lt;enumeration value="ZARZADCA_DOMU"/&gt;
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_KIER_WIEZIENIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
