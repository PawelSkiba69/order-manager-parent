
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deklaracjaCelnaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deklaracjaCelnaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="szczegoly" type="{http://e-nadawca.poczta-polska.pl}szczegolyDeklaracjiCelnejType" maxOccurs="5"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="podarunek" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dokument" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="probkaHandlowa" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="zwrotTowaru" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="towary" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="inny" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="wyjasnienie" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="oplatyPocztowe" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uwagi" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="licencja" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="swiadectwo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="faktura" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numerReferencyjnyImportera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numerTelefonuImportera" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="waluta" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deklaracjaCelnaType", propOrder = {
    "szczegoly"
})
public class DeklaracjaCelnaType {

    @XmlElement(required = true)
    protected List<SzczegolyDeklaracjiCelnejType> szczegoly;
    @XmlAttribute(name = "podarunek")
    protected Boolean podarunek;
    @XmlAttribute(name = "dokument")
    protected Boolean dokument;
    @XmlAttribute(name = "probkaHandlowa")
    protected Boolean probkaHandlowa;
    @XmlAttribute(name = "zwrotTowaru")
    protected Boolean zwrotTowaru;
    @XmlAttribute(name = "towary")
    protected Boolean towary;
    @XmlAttribute(name = "inny")
    protected Boolean inny;
    @XmlAttribute(name = "wyjasnienie")
    protected String wyjasnienie;
    @XmlAttribute(name = "oplatyPocztowe")
    protected String oplatyPocztowe;
    @XmlAttribute(name = "uwagi")
    protected String uwagi;
    @XmlAttribute(name = "licencja")
    protected String licencja;
    @XmlAttribute(name = "swiadectwo")
    protected String swiadectwo;
    @XmlAttribute(name = "faktura")
    protected String faktura;
    @XmlAttribute(name = "numerReferencyjnyImportera")
    protected String numerReferencyjnyImportera;
    @XmlAttribute(name = "numerTelefonuImportera")
    protected String numerTelefonuImportera;
    @XmlAttribute(name = "waluta")
    protected String waluta;

    /**
     * Gets the value of the szczegoly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the szczegoly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSzczegoly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SzczegolyDeklaracjiCelnejType }
     * 
     * 
     */
    public List<SzczegolyDeklaracjiCelnejType> getSzczegoly() {
        if (szczegoly == null) {
            szczegoly = new ArrayList<SzczegolyDeklaracjiCelnejType>();
        }
        return this.szczegoly;
    }

    /**
     * Gets the value of the podarunek property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPodarunek() {
        return podarunek;
    }

    /**
     * Sets the value of the podarunek property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPodarunek(Boolean value) {
        this.podarunek = value;
    }

    /**
     * Gets the value of the dokument property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDokument() {
        return dokument;
    }

    /**
     * Sets the value of the dokument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDokument(Boolean value) {
        this.dokument = value;
    }

    /**
     * Gets the value of the probkaHandlowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProbkaHandlowa() {
        return probkaHandlowa;
    }

    /**
     * Sets the value of the probkaHandlowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProbkaHandlowa(Boolean value) {
        this.probkaHandlowa = value;
    }

    /**
     * Gets the value of the zwrotTowaru property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZwrotTowaru() {
        return zwrotTowaru;
    }

    /**
     * Sets the value of the zwrotTowaru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZwrotTowaru(Boolean value) {
        this.zwrotTowaru = value;
    }

    /**
     * Gets the value of the towary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTowary() {
        return towary;
    }

    /**
     * Sets the value of the towary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTowary(Boolean value) {
        this.towary = value;
    }

    /**
     * Gets the value of the inny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInny() {
        return inny;
    }

    /**
     * Sets the value of the inny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInny(Boolean value) {
        this.inny = value;
    }

    /**
     * Gets the value of the wyjasnienie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWyjasnienie() {
        return wyjasnienie;
    }

    /**
     * Sets the value of the wyjasnienie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWyjasnienie(String value) {
        this.wyjasnienie = value;
    }

    /**
     * Gets the value of the oplatyPocztowe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOplatyPocztowe() {
        return oplatyPocztowe;
    }

    /**
     * Sets the value of the oplatyPocztowe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOplatyPocztowe(String value) {
        this.oplatyPocztowe = value;
    }

    /**
     * Gets the value of the uwagi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUwagi() {
        return uwagi;
    }

    /**
     * Sets the value of the uwagi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUwagi(String value) {
        this.uwagi = value;
    }

    /**
     * Gets the value of the licencja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicencja() {
        return licencja;
    }

    /**
     * Sets the value of the licencja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicencja(String value) {
        this.licencja = value;
    }

    /**
     * Gets the value of the swiadectwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwiadectwo() {
        return swiadectwo;
    }

    /**
     * Sets the value of the swiadectwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwiadectwo(String value) {
        this.swiadectwo = value;
    }

    /**
     * Gets the value of the faktura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaktura() {
        return faktura;
    }

    /**
     * Sets the value of the faktura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaktura(String value) {
        this.faktura = value;
    }

    /**
     * Gets the value of the numerReferencyjnyImportera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerReferencyjnyImportera() {
        return numerReferencyjnyImportera;
    }

    /**
     * Sets the value of the numerReferencyjnyImportera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerReferencyjnyImportera(String value) {
        this.numerReferencyjnyImportera = value;
    }

    /**
     * Gets the value of the numerTelefonuImportera property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTelefonuImportera() {
        return numerTelefonuImportera;
    }

    /**
     * Sets the value of the numerTelefonuImportera property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTelefonuImportera(String value) {
        this.numerTelefonuImportera = value;
    }

    /**
     * Gets the value of the waluta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaluta() {
        return waluta;
    }

    /**
     * Sets the value of the waluta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaluta(String value) {
        this.waluta = value;
    }

}
