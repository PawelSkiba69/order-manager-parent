
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paczkaZagranicznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paczkaZagranicznaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zwrot" type="{http://e-nadawca.poczta-polska.pl}zwrotType" minOccurs="0"/&gt;
 *         &lt;element name="deklaracjaCelna" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelnaType" minOccurs="0"/&gt;
 *         &lt;element name="deklaracjaCelna2" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelna2Type" minOccurs="0"/&gt;
 *         &lt;element name="sposobNadaniaInterconnect" type="{http://e-nadawca.poczta-polska.pl}sposobNadaniaInterconnectType" minOccurs="0"/&gt;
 *         &lt;element name="sposobDoreczenia" type="{http://e-nadawca.poczta-polska.pl}sposobDoreczeniaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&gt;
 *       &lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" /&gt;
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" /&gt;
 *       &lt;attribute name="utrudnionaManipulacja" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ekspres" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="numerReferencyjnyCelny" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numerPrzesylkiKlienta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paczkaZagranicznaType", propOrder = {
    "zwrot",
    "deklaracjaCelna",
    "deklaracjaCelna2",
    "sposobNadaniaInterconnect",
    "sposobDoreczenia"
})
public class PaczkaZagranicznaType
    extends PrzesylkaRejestrowanaType
{

    protected ZwrotType zwrot;
    protected DeklaracjaCelnaType deklaracjaCelna;
    protected DeklaracjaCelna2Type deklaracjaCelna2;
    protected String sposobNadaniaInterconnect;
    protected SposobDoreczeniaType sposobDoreczenia;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "utrudnionaManipulacja")
    protected Boolean utrudnionaManipulacja;
    @XmlAttribute(name = "ekspres")
    protected Boolean ekspres;
    @XmlAttribute(name = "numerReferencyjnyCelny")
    protected String numerReferencyjnyCelny;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;

    /**
     * Gets the value of the zwrot property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotType }
     *     
     */
    public ZwrotType getZwrot() {
        return zwrot;
    }

    /**
     * Sets the value of the zwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotType }
     *     
     */
    public void setZwrot(ZwrotType value) {
        this.zwrot = value;
    }

    /**
     * Gets the value of the deklaracjaCelna property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public DeklaracjaCelnaType getDeklaracjaCelna() {
        return deklaracjaCelna;
    }

    /**
     * Sets the value of the deklaracjaCelna property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public void setDeklaracjaCelna(DeklaracjaCelnaType value) {
        this.deklaracjaCelna = value;
    }

    /**
     * Gets the value of the deklaracjaCelna2 property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracjaCelna2Type }
     *     
     */
    public DeklaracjaCelna2Type getDeklaracjaCelna2() {
        return deklaracjaCelna2;
    }

    /**
     * Sets the value of the deklaracjaCelna2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracjaCelna2Type }
     *     
     */
    public void setDeklaracjaCelna2(DeklaracjaCelna2Type value) {
        this.deklaracjaCelna2 = value;
    }

    /**
     * Gets the value of the sposobNadaniaInterconnect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSposobNadaniaInterconnect() {
        return sposobNadaniaInterconnect;
    }

    /**
     * Sets the value of the sposobNadaniaInterconnect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSposobNadaniaInterconnect(String value) {
        this.sposobNadaniaInterconnect = value;
    }

    /**
     * Gets the value of the sposobDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link SposobDoreczeniaType }
     *     
     */
    public SposobDoreczeniaType getSposobDoreczenia() {
        return sposobDoreczenia;
    }

    /**
     * Sets the value of the sposobDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobDoreczeniaType }
     *     
     */
    public void setSposobDoreczenia(SposobDoreczeniaType value) {
        this.sposobDoreczenia = value;
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
     * Gets the value of the utrudnionaManipulacja property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtrudnionaManipulacja() {
        return utrudnionaManipulacja;
    }

    /**
     * Sets the value of the utrudnionaManipulacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtrudnionaManipulacja(Boolean value) {
        this.utrudnionaManipulacja = value;
    }

    /**
     * Gets the value of the ekspres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEkspres() {
        return ekspres;
    }

    /**
     * Sets the value of the ekspres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEkspres(Boolean value) {
        this.ekspres = value;
    }

    /**
     * Gets the value of the numerReferencyjnyCelny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerReferencyjnyCelny() {
        return numerReferencyjnyCelny;
    }

    /**
     * Sets the value of the numerReferencyjnyCelny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerReferencyjnyCelny(String value) {
        this.numerReferencyjnyCelny = value;
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

}
