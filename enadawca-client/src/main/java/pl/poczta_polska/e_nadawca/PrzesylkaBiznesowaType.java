
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for przesylkaBiznesowaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaBiznesowaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="subPrzesylka" type="{http://e-nadawca.poczta-polska.pl}subPrzesylkaBiznesowaType" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="adresDlaZwrotu" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieOdbioru" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieOdbioruBiznesowaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doreczenie" type="{http://e-nadawca.poczta-polska.pl}doreczenieBiznesowaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zwrotDokumentow" type="{http://e-nadawca.poczta-polska.pl}zwrotDokumentowBiznesowaType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" /&amp;gt;
 *       &amp;lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytBiznesowaType" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="numerTransakcjiOdbioru" type="{http://e-nadawca.poczta-polska.pl}numerTransakcjiOdbioruType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaBiznesowaType", propOrder = {
    "pobranie",
    "urzadWydaniaEPrzesylki",
    "subPrzesylka",
    "ubezpieczenie",
    "epo",
    "adresDlaZwrotu",
    "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce",
    "potwierdzenieOdbioru",
    "doreczenie",
    "zwrotDokumentow"
})
public class PrzesylkaBiznesowaType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected List<SubPrzesylkaBiznesowaType> subPrzesylka;
    protected UbezpieczenieType ubezpieczenie;
    protected EPOType epo;
    protected AdresType adresDlaZwrotu;
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    protected PotwierdzenieOdbioruBiznesowaType potwierdzenieOdbioru;
    protected DoreczenieBiznesowaType doreczenie;
    protected ZwrotDokumentowBiznesowaType zwrotDokumentow;
    @XmlAttribute(name = "zasadySpecjalne")
    protected ZasadySpecjalneEnum zasadySpecjalne;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "gabaryt")
    protected GabarytBiznesowaType gabaryt;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
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
     * {@link SubPrzesylkaBiznesowaType }
     * 
     * 
     */
    public List<SubPrzesylkaBiznesowaType> getSubPrzesylka() {
        if (subPrzesylka == null) {
            subPrzesylka = new ArrayList<SubPrzesylkaBiznesowaType>();
        }
        return this.subPrzesylka;
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
     * Gets the value of the adresDlaZwrotu property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getAdresDlaZwrotu() {
        return adresDlaZwrotu;
    }

    /**
     * Sets the value of the adresDlaZwrotu property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setAdresDlaZwrotu(AdresType value) {
        this.adresDlaZwrotu = value;
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
