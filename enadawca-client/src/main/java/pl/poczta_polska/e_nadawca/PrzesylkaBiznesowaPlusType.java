
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for przesylkaBiznesowaPlusType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaBiznesowaPlusType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="urzadWydaniaPrzesylki" type="{http://e-nadawca.poczta-polska.pl}placowkaPocztowaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subPrzesylka" type="{http://e-nadawca.poczta-polska.pl}subPrzesylkaBiznesowaPlusType" maxOccurs="100" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element name="dataDrugiejProbyDoreczenia" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *           &amp;lt;element name="drugaProbaDoreczeniaPoLiczbieDni" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieOdbioru" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieOdbioruBiznesowaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doreczenie" type="{http://e-nadawca.poczta-polska.pl}doreczenieBiznesowaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zwrotDokumentow" type="{http://e-nadawca.poczta-polska.pl}zwrotDokumentowBiznesowaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytBiznesowaType" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="kwotaTranzakcji" type="{http://e-nadawca.poczta-polska.pl}kwotaTranzakcjiType" /&amp;gt;
 *       &amp;lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" /&amp;gt;
 *       &amp;lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&amp;gt;
 *       &amp;lt;attribute name="zwrotDoslanie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="eKontaktAdresata" type="{http://e-nadawca.poczta-polska.pl}eKontaktType" /&amp;gt;
 *       &amp;lt;attribute name="eSposobPowiadomieniaAdresata" type="{http://e-nadawca.poczta-polska.pl}eSposobPowiadomieniaType" /&amp;gt;
 *       &amp;lt;attribute name="numerPrzesylkiKlienta" type="{http://e-nadawca.poczta-polska.pl}numerPrzesylkiKlientaType" /&amp;gt;
 *       &amp;lt;attribute name="iloscDniOczekiwaniaNaWydanie" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="oczekiwanyTerminDoreczenia" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *       &amp;lt;attribute name="terminRodzajPlus" type="{http://e-nadawca.poczta-polska.pl}terminRodzajPlusType" /&amp;gt;
 *       &amp;lt;attribute name="numerTransakcjiOdbioru" type="{http://e-nadawca.poczta-polska.pl}numerTransakcjiOdbioruType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaBiznesowaPlusType", propOrder = {
    "pobranie",
    "urzadWydaniaPrzesylki",
    "subPrzesylka",
    "dataDrugiejProbyDoreczenia",
    "drugaProbaDoreczeniaPoLiczbieDni",
    "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce",
    "potwierdzenieOdbioru",
    "doreczenie",
    "zwrotDokumentow"
})
public class PrzesylkaBiznesowaPlusType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected PlacowkaPocztowaType urzadWydaniaPrzesylki;
    protected List<SubPrzesylkaBiznesowaPlusType> subPrzesylka;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDrugiejProbyDoreczenia;
    protected Integer drugaProbaDoreczeniaPoLiczbieDni;
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    protected PotwierdzenieOdbioruBiznesowaType potwierdzenieOdbioru;
    protected DoreczenieBiznesowaType doreczenie;
    protected ZwrotDokumentowBiznesowaType zwrotDokumentow;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "gabaryt")
    protected GabarytBiznesowaType gabaryt;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "kwotaTranzakcji")
    protected Integer kwotaTranzakcji;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "zwrotDoslanie")
    protected Boolean zwrotDoslanie;
    @XmlAttribute(name = "eKontaktAdresata")
    protected String eKontaktAdresata;
    @XmlAttribute(name = "eSposobPowiadomieniaAdresata")
    protected ESposobPowiadomieniaType eSposobPowiadomieniaAdresata;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;
    @XmlAttribute(name = "iloscDniOczekiwaniaNaWydanie")
    protected Integer iloscDniOczekiwaniaNaWydanie;
    @XmlAttribute(name = "oczekiwanyTerminDoreczenia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oczekiwanyTerminDoreczenia;
    @XmlAttribute(name = "terminRodzajPlus")
    protected TerminRodzajPlusType terminRodzajPlus;
    @XmlAttribute(name = "numerTransakcjiOdbioru")
    protected String numerTransakcjiOdbioru;

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the urzadWydaniaPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link PlacowkaPocztowaType }
     *     
     */
    public PlacowkaPocztowaType getUrzadWydaniaPrzesylki() {
        return urzadWydaniaPrzesylki;
    }

    /**
     * Sets the value of the urzadWydaniaPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacowkaPocztowaType }
     *     
     */
    public void setUrzadWydaniaPrzesylki(PlacowkaPocztowaType value) {
        this.urzadWydaniaPrzesylki = value;
    }

    /**
     * Gets the value of the subPrzesylka property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subPrzesylka property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSubPrzesylka().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SubPrzesylkaBiznesowaPlusType }
     * 
     * 
     */
    public List<SubPrzesylkaBiznesowaPlusType> getSubPrzesylka() {
        if (subPrzesylka == null) {
            subPrzesylka = new ArrayList<SubPrzesylkaBiznesowaPlusType>();
        }
        return this.subPrzesylka;
    }

    /**
     * Gets the value of the dataDrugiejProbyDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDrugiejProbyDoreczenia() {
        return dataDrugiejProbyDoreczenia;
    }

    /**
     * Sets the value of the dataDrugiejProbyDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDrugiejProbyDoreczenia(XMLGregorianCalendar value) {
        this.dataDrugiejProbyDoreczenia = value;
    }

    /**
     * Gets the value of the drugaProbaDoreczeniaPoLiczbieDni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDrugaProbaDoreczeniaPoLiczbieDni() {
        return drugaProbaDoreczeniaPoLiczbieDni;
    }

    /**
     * Sets the value of the drugaProbaDoreczeniaPoLiczbieDni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDrugaProbaDoreczeniaPoLiczbieDni(Integer value) {
        this.drugaProbaDoreczeniaPoLiczbieDni = value;
    }

    /**
     * Gets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprawdzenieZawartosciPrzesylkiPrzezOdbiorce() {
        return sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    }

    /**
     * Sets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprawdzenieZawartosciPrzesylkiPrzezOdbiorce(Boolean value) {
        this.sprawdzenieZawartosciPrzesylkiPrzezOdbiorce = value;
    }

    /**
     * Gets the value of the potwierdzenieOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieOdbioruBiznesowaType }
     *     
     */
    public PotwierdzenieOdbioruBiznesowaType getPotwierdzenieOdbioru() {
        return potwierdzenieOdbioru;
    }

    /**
     * Sets the value of the potwierdzenieOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieOdbioruBiznesowaType }
     *     
     */
    public void setPotwierdzenieOdbioru(PotwierdzenieOdbioruBiznesowaType value) {
        this.potwierdzenieOdbioru = value;
    }

    /**
     * Gets the value of the doreczenie property.
     * 
     * @return
     *     possible object is
     *     {@link DoreczenieBiznesowaType }
     *     
     */
    public DoreczenieBiznesowaType getDoreczenie() {
        return doreczenie;
    }

    /**
     * Sets the value of the doreczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoreczenieBiznesowaType }
     *     
     */
    public void setDoreczenie(DoreczenieBiznesowaType value) {
        this.doreczenie = value;
    }

    /**
     * Gets the value of the zwrotDokumentow property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotDokumentowBiznesowaType }
     *     
     */
    public ZwrotDokumentowBiznesowaType getZwrotDokumentow() {
        return zwrotDokumentow;
    }

    /**
     * Sets the value of the zwrotDokumentow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotDokumentowBiznesowaType }
     *     
     */
    public void setZwrotDokumentow(ZwrotDokumentowBiznesowaType value) {
        this.zwrotDokumentow = value;
    }

    /**
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosteRestante() {
        return posteRestante;
    }

    /**
     * Sets the value of the posteRestante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosteRestante(Boolean value) {
        this.posteRestante = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the gabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link GabarytBiznesowaType }
     *     
     */
    public GabarytBiznesowaType getGabaryt() {
        return gabaryt;
    }

    /**
     * Sets the value of the gabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GabarytBiznesowaType }
     *     
     */
    public void setGabaryt(GabarytBiznesowaType value) {
        this.gabaryt = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the kwotaTranzakcji property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKwotaTranzakcji() {
        return kwotaTranzakcji;
    }

    /**
     * Sets the value of the kwotaTranzakcji property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKwotaTranzakcji(Integer value) {
        this.kwotaTranzakcji = value;
    }

    /**
     * Gets the value of the ostroznie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOstroznie() {
        return ostroznie;
    }

    /**
     * Sets the value of the ostroznie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOstroznie(Boolean value) {
        this.ostroznie = value;
    }

    /**
     * Gets the value of the kategoria property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriaType }
     *     
     */
    public KategoriaType getKategoria() {
        return kategoria;
    }

    /**
     * Sets the value of the kategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriaType }
     *     
     */
    public void setKategoria(KategoriaType value) {
        this.kategoria = value;
    }

    /**
     * Gets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPotwierdzenOdbioru() {
        return iloscPotwierdzenOdbioru;
    }

    /**
     * Sets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPotwierdzenOdbioru(Integer value) {
        this.iloscPotwierdzenOdbioru = value;
    }

    /**
     * Gets the value of the zwrotDoslanie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZwrotDoslanie() {
        return zwrotDoslanie;
    }

    /**
     * Sets the value of the zwrotDoslanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZwrotDoslanie(Boolean value) {
        this.zwrotDoslanie = value;
    }

    /**
     * Gets the value of the eKontaktAdresata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKontaktAdresata() {
        return eKontaktAdresata;
    }

    /**
     * Sets the value of the eKontaktAdresata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKontaktAdresata(String value) {
        this.eKontaktAdresata = value;
    }

    /**
     * Gets the value of the eSposobPowiadomieniaAdresata property.
     * 
     * @return
     *     possible object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public ESposobPowiadomieniaType getESposobPowiadomieniaAdresata() {
        return eSposobPowiadomieniaAdresata;
    }

    /**
     * Sets the value of the eSposobPowiadomieniaAdresata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public void setESposobPowiadomieniaAdresata(ESposobPowiadomieniaType value) {
        this.eSposobPowiadomieniaAdresata = value;
    }

    /**
     * Gets the value of the numerPrzesylkiKlienta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPrzesylkiKlienta() {
        return numerPrzesylkiKlienta;
    }

    /**
     * Sets the value of the numerPrzesylkiKlienta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPrzesylkiKlienta(String value) {
        this.numerPrzesylkiKlienta = value;
    }

    /**
     * Gets the value of the iloscDniOczekiwaniaNaWydanie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscDniOczekiwaniaNaWydanie() {
        return iloscDniOczekiwaniaNaWydanie;
    }

    /**
     * Sets the value of the iloscDniOczekiwaniaNaWydanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscDniOczekiwaniaNaWydanie(Integer value) {
        this.iloscDniOczekiwaniaNaWydanie = value;
    }

    /**
     * Gets the value of the oczekiwanyTerminDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOczekiwanyTerminDoreczenia() {
        return oczekiwanyTerminDoreczenia;
    }

    /**
     * Sets the value of the oczekiwanyTerminDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOczekiwanyTerminDoreczenia(XMLGregorianCalendar value) {
        this.oczekiwanyTerminDoreczenia = value;
    }

    /**
     * Gets the value of the terminRodzajPlus property.
     * 
     * @return
     *     possible object is
     *     {@link TerminRodzajPlusType }
     *     
     */
    public TerminRodzajPlusType getTerminRodzajPlus() {
        return terminRodzajPlus;
    }

    /**
     * Sets the value of the terminRodzajPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminRodzajPlusType }
     *     
     */
    public void setTerminRodzajPlus(TerminRodzajPlusType value) {
        this.terminRodzajPlus = value;
    }

    /**
     * Gets the value of the numerTransakcjiOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTransakcjiOdbioru() {
        return numerTransakcjiOdbioru;
    }

    /**
     * Sets the value of the numerTransakcjiOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTransakcjiOdbioru(String value) {
        this.numerTransakcjiOdbioru = value;
    }

}
