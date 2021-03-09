
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for pocztexKrajowyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="pocztexKrajowyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="odbiorPrzesylkiOdNadawcy" type="{http://e-nadawca.poczta-polska.pl}odbiorPrzesylkiOdNadawcyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="doreczenie" type="{http://e-nadawca.poczta-polska.pl}doreczenieType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="zwrotDokumentow" type="{http://e-nadawca.poczta-polska.pl}zwrotDokumentowType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieOdbioru" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieOdbioruType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="potwierdzenieDoreczenia" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieDoreczeniaType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&amp;gt;
 *       &amp;lt;attribute name="terminRodzaj" use="required" type="{http://e-nadawca.poczta-polska.pl}terminRodzajType" /&amp;gt;
 *       &amp;lt;attribute name="kopertaFirmowa" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="masa" use="required" type="{http://e-nadawca.poczta-polska.pl}masaType" /&amp;gt;
 *       &amp;lt;attribute name="wartosc" use="required" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&amp;gt;
 *       &amp;lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="ponadgabaryt" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *       &amp;lt;attribute name="uiszczaOplate" use="required" type="{http://e-nadawca.poczta-polska.pl}uiszczaOplateType" /&amp;gt;
 *       &amp;lt;attribute name="odleglosc" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pocztexKrajowyType", propOrder = {
    "pobranie",
    "odbiorPrzesylkiOdNadawcy",
    "doreczenie",
    "zwrotDokumentow",
    "potwierdzenieOdbioru",
    "potwierdzenieDoreczenia",
    "ubezpieczenie"
})
public class PocztexKrajowyType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected OdbiorPrzesylkiOdNadawcyType odbiorPrzesylkiOdNadawcy;
    protected DoreczenieType doreczenie;
    protected ZwrotDokumentowType zwrotDokumentow;
    protected PotwierdzenieOdbioruType potwierdzenieOdbioru;
    protected PotwierdzenieDoreczeniaType potwierdzenieDoreczenia;
    protected UbezpieczenieType ubezpieczenie;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "terminRodzaj", required = true)
    protected TerminRodzajType terminRodzaj;
    @XmlAttribute(name = "kopertaFirmowa")
    protected Boolean kopertaFirmowa;
    @XmlAttribute(name = "masa", required = true)
    protected int masa;
    @XmlAttribute(name = "wartosc", required = true)
    protected int wartosc;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "ponadgabaryt")
    protected Boolean ponadgabaryt;
    @XmlAttribute(name = "uiszczaOplate", required = true)
    protected UiszczaOplateType uiszczaOplate;
    @XmlAttribute(name = "odleglosc")
    protected Integer odleglosc;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce")
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;

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
     * Gets the value of the doreczenie property.
     * 
     * @return
     *     possible object is
     *     {@link DoreczenieType }
     *     
     */
    public DoreczenieType getDoreczenie() {
        return doreczenie;
    }

    /**
     * Sets the value of the doreczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoreczenieType }
     *     
     */
    public void setDoreczenie(DoreczenieType value) {
        this.doreczenie = value;
    }

    /**
     * Gets the value of the zwrotDokumentow property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotDokumentowType }
     *     
     */
    public ZwrotDokumentowType getZwrotDokumentow() {
        return zwrotDokumentow;
    }

    /**
     * Sets the value of the zwrotDokumentow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotDokumentowType }
     *     
     */
    public void setZwrotDokumentow(ZwrotDokumentowType value) {
        this.zwrotDokumentow = value;
    }

    /**
     * Gets the value of the potwierdzenieOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieOdbioruType }
     *     
     */
    public PotwierdzenieOdbioruType getPotwierdzenieOdbioru() {
        return potwierdzenieOdbioru;
    }

    /**
     * Sets the value of the potwierdzenieOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieOdbioruType }
     *     
     */
    public void setPotwierdzenieOdbioru(PotwierdzenieOdbioruType value) {
        this.potwierdzenieOdbioru = value;
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
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPosteRestante() {
        if (posteRestante == null) {
            return false;
        } else {
            return posteRestante;
        }
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
     * Gets the value of the terminRodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link TerminRodzajType }
     *     
     */
    public TerminRodzajType getTerminRodzaj() {
        return terminRodzaj;
    }

    /**
     * Sets the value of the terminRodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminRodzajType }
     *     
     */
    public void setTerminRodzaj(TerminRodzajType value) {
        this.terminRodzaj = value;
    }

    /**
     * Gets the value of the kopertaFirmowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKopertaFirmowa() {
        return kopertaFirmowa;
    }

    /**
     * Sets the value of the kopertaFirmowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKopertaFirmowa(Boolean value) {
        this.kopertaFirmowa = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     */
    public int getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     */
    public void setMasa(int value) {
        this.masa = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     */
    public int getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     */
    public void setWartosc(int value) {
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

}
