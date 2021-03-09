
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for uslugaKurierskaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="uslugaKurierskaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="odbiorPrzesylkiOdNadawcy" type="{http://e-nadawca.poczta-polska.pl}odbiorPrzesylkiOdNadawcyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieDoreczenia" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieDoreczeniaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="subPrzesylka" type="{http://e-nadawca.poczta-polska.pl}subUslugaKurierskaType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="potwierdzenieOdbioru" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieOdbioruKurierskaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zwrotDokumentow" type="{http://e-nadawca.poczta-polska.pl}zwrotDokumentowKurierskaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doreczenie" type="{http://e-nadawca.poczta-polska.pl}doreczenieUslugaKurierskaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" /&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="ponadgabaryt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="odleglosc" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="uiszczaOplate" type="{http://e-nadawca.poczta-polska.pl}uiszczaOplateType" /&amp;gt;
 *       &amp;lt;attribute name="termin" type="{http://e-nadawca.poczta-polska.pl}terminKurierskaType" /&amp;gt;
 *       &amp;lt;attribute name="opakowanie" type="{http://e-nadawca.poczta-polska.pl}opakowanieKurierskaType" /&amp;gt;
 *       &amp;lt;attribute name="numerPrzesylkiKlienta" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="numerTransakcjiOdbioru" type="{http://e-nadawca.poczta-polska.pl}numerTransakcjiOdbioruType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uslugaKurierskaType", propOrder = {
    "pobranie",
    "odbiorPrzesylkiOdNadawcy",
    "potwierdzenieDoreczenia",
    "urzadWydaniaEPrzesylki",
    "subPrzesylka",
    "potwierdzenieOdbioru",
    "ubezpieczenie",
    "zwrotDokumentow",
    "doreczenie",
    "epo"
})
public class UslugaKurierskaType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected OdbiorPrzesylkiOdNadawcyType odbiorPrzesylkiOdNadawcy;
    protected PotwierdzenieDoreczeniaType potwierdzenieDoreczenia;
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected List<SubUslugaKurierskaType> subPrzesylka;
    protected PotwierdzenieOdbioruKurierskaType potwierdzenieOdbioru;
    protected UbezpieczenieType ubezpieczenie;
    protected ZwrotDokumentowKurierskaType zwrotDokumentow;
    protected DoreczenieUslugaKurierskaType doreczenie;
    protected EPOType epo;
    @XmlAttribute(name = "zasadySpecjalne")
    protected ZasadySpecjalneEnum zasadySpecjalne;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "ponadgabaryt")
    protected Boolean ponadgabaryt;
    @XmlAttribute(name = "odleglosc")
    protected Integer odleglosc;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce")
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "uiszczaOplate")
    protected UiszczaOplateType uiszczaOplate;
    @XmlAttribute(name = "termin")
    protected TerminKurierskaType termin;
    @XmlAttribute(name = "opakowanie")
    protected OpakowanieKurierskaType opakowanie;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;
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
     * Gets the value of the odbiorPrzesylkiOdNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link OdbiorPrzesylkiOdNadawcyType }
     *     
     */
    public OdbiorPrzesylkiOdNadawcyType getOdbiorPrzesylkiOdNadawcy() {
        return odbiorPrzesylkiOdNadawcy;
    }

    /**
     * Sets the value of the odbiorPrzesylkiOdNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdbiorPrzesylkiOdNadawcyType }
     *     
     */
    public void setOdbiorPrzesylkiOdNadawcy(OdbiorPrzesylkiOdNadawcyType value) {
        this.odbiorPrzesylkiOdNadawcy = value;
    }

    /**
     * Gets the value of the potwierdzenieDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public PotwierdzenieDoreczeniaType getPotwierdzenieDoreczenia() {
        return potwierdzenieDoreczenia;
    }

    /**
     * Sets the value of the potwierdzenieDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public void setPotwierdzenieDoreczenia(PotwierdzenieDoreczeniaType value) {
        this.potwierdzenieDoreczenia = value;
    }

    /**
     * Gets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public UrzadWydaniaEPrzesylkiType getUrzadWydaniaEPrzesylki() {
        return urzadWydaniaEPrzesylki;
    }

    /**
     * Sets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public void setUrzadWydaniaEPrzesylki(UrzadWydaniaEPrzesylkiType value) {
        this.urzadWydaniaEPrzesylki = value;
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
     * {@link SubUslugaKurierskaType }
     * 
     * 
     */
    public List<SubUslugaKurierskaType> getSubPrzesylka() {
        if (subPrzesylka == null) {
            subPrzesylka = new ArrayList<SubUslugaKurierskaType>();
        }
        return this.subPrzesylka;
    }

    /**
     * Gets the value of the potwierdzenieOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieOdbioruKurierskaType }
     *     
     */
    public PotwierdzenieOdbioruKurierskaType getPotwierdzenieOdbioru() {
        return potwierdzenieOdbioru;
    }

    /**
     * Sets the value of the potwierdzenieOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieOdbioruKurierskaType }
     *     
     */
    public void setPotwierdzenieOdbioru(PotwierdzenieOdbioruKurierskaType value) {
        this.potwierdzenieOdbioru = value;
    }

    /**
     * Gets the value of the ubezpieczenie property.
     * 
     * @return
     *     possible object is
     *     {@link UbezpieczenieType }
     *     
     */
    public UbezpieczenieType getUbezpieczenie() {
        return ubezpieczenie;
    }

    /**
     * Sets the value of the ubezpieczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link UbezpieczenieType }
     *     
     */
    public void setUbezpieczenie(UbezpieczenieType value) {
        this.ubezpieczenie = value;
    }

    /**
     * Gets the value of the zwrotDokumentow property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotDokumentowKurierskaType }
     *     
     */
    public ZwrotDokumentowKurierskaType getZwrotDokumentow() {
        return zwrotDokumentow;
    }

    /**
     * Sets the value of the zwrotDokumentow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotDokumentowKurierskaType }
     *     
     */
    public void setZwrotDokumentow(ZwrotDokumentowKurierskaType value) {
        this.zwrotDokumentow = value;
    }

    /**
     * Gets the value of the doreczenie property.
     * 
     * @return
     *     possible object is
     *     {@link DoreczenieUslugaKurierskaType }
     *     
     */
    public DoreczenieUslugaKurierskaType getDoreczenie() {
        return doreczenie;
    }

    /**
     * Sets the value of the doreczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoreczenieUslugaKurierskaType }
     *     
     */
    public void setDoreczenie(DoreczenieUslugaKurierskaType value) {
        this.doreczenie = value;
    }

    /**
     * Gets the value of the epo property.
     * 
     * @return
     *     possible object is
     *     {@link EPOType }
     *     
     */
    public EPOType getEpo() {
        return epo;
    }

    /**
     * Sets the value of the epo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPOType }
     *     
     */
    public void setEpo(EPOType value) {
        this.epo = value;
    }

    /**
     * Gets the value of the zasadySpecjalne property.
     * 
     * @return
     *     possible object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public ZasadySpecjalneEnum getZasadySpecjalne() {
        return zasadySpecjalne;
    }

    /**
     * Sets the value of the zasadySpecjalne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public void setZasadySpecjalne(ZasadySpecjalneEnum value) {
        this.zasadySpecjalne = value;
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
     * Gets the value of the ponadgabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPonadgabaryt() {
        return ponadgabaryt;
    }

    /**
     * Sets the value of the ponadgabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPonadgabaryt(Boolean value) {
        this.ponadgabaryt = value;
    }

    /**
     * Gets the value of the odleglosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdleglosc() {
        return odleglosc;
    }

    /**
     * Sets the value of the odleglosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdleglosc(Integer value) {
        this.odleglosc = value;
    }

    /**
     * Gets the value of the zawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZawartosc() {
        return zawartosc;
    }

    /**
     * Sets the value of the zawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZawartosc(String value) {
        this.zawartosc = value;
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
     * Gets the value of the uiszczaOplate property.
     * 
     * @return
     *     possible object is
     *     {@link UiszczaOplateType }
     *     
     */
    public UiszczaOplateType getUiszczaOplate() {
        return uiszczaOplate;
    }

    /**
     * Sets the value of the uiszczaOplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiszczaOplateType }
     *     
     */
    public void setUiszczaOplate(UiszczaOplateType value) {
        this.uiszczaOplate = value;
    }

    /**
     * Gets the value of the termin property.
     * 
     * @return
     *     possible object is
     *     {@link TerminKurierskaType }
     *     
     */
    public TerminKurierskaType getTermin() {
        return termin;
    }

    /**
     * Sets the value of the termin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminKurierskaType }
     *     
     */
    public void setTermin(TerminKurierskaType value) {
        this.termin = value;
    }

    /**
     * Gets the value of the opakowanie property.
     * 
     * @return
     *     possible object is
     *     {@link OpakowanieKurierskaType }
     *     
     */
    public OpakowanieKurierskaType getOpakowanie() {
        return opakowanie;
    }

    /**
     * Sets the value of the opakowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpakowanieKurierskaType }
     *     
     */
    public void setOpakowanie(OpakowanieKurierskaType value) {
        this.opakowanie = value;
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
