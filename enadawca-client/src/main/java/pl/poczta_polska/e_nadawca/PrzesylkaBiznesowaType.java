
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaBiznesowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaBiznesowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType" minOccurs="0"/&gt;
 *           &lt;element name="subPrzesylka" type="{http://e-nadawca.poczta-polska.pl}subPrzesylkaBiznesowaType" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/&gt;
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" /&gt;
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" /&gt;
 *       &lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytBiznesowaType" /&gt;
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" /&gt;
 *       &lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="numerTransakcjiOdbioru" type="{http://e-nadawca.poczta-polska.pl}numerTransakcjiOdbioruType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaBiznesowaType", propOrder = {
    "pobranie",
    "urzadWydaniaEPrzesylki",
    "subPrzesylka",
    "ubezpieczenie",
    "epo"
})
public class PrzesylkaBiznesowaType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected List<SubPrzesylkaBiznesowaType> subPrzesylka;
    protected UbezpieczenieType ubezpieczenie;
    protected EPOType epo;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrzesylka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrzesylka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
