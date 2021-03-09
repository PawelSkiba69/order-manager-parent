
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for deklaracjaCelna2Type complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="deklaracjaCelna2Type"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}DeklaracaCelnaRodzajEnum"/&amp;gt;
 *         &amp;lt;element name="zawartoscPrzesylki" type="{http://e-nadawca.poczta-polska.pl}ZawartoscPrzesylkiZagranicznejEnum"/&amp;gt;
 *         &amp;lt;element name="dokumentyTowarzyszace" type="{http://e-nadawca.poczta-polska.pl}DokumentyTowarzyszaceType" maxOccurs="5" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="wyjasnienie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="oplatyPocztowe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="uwagi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numerReferencyjnyImportera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numerTelefonuImportera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="walutaKodISO" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="szczegolyZawartosciPrzesylki" type="{http://e-nadawca.poczta-polska.pl}SzczegolyZawartosciPrzesylkiZagranicznejType" maxOccurs="5"/&amp;gt;
 *         &amp;lt;element name="numerReferencyjnyCelny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deklaracjaCelna2Type", propOrder = {
    "rodzaj",
    "zawartoscPrzesylki",
    "dokumentyTowarzyszace",
    "wyjasnienie",
    "oplatyPocztowe",
    "uwagi",
    "numerReferencyjnyImportera",
    "numerTelefonuImportera",
    "walutaKodISO",
    "szczegolyZawartosciPrzesylki",
    "numerReferencyjnyCelny"
})
public class DeklaracjaCelna2Type {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DeklaracaCelnaRodzajEnum rodzaj;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ZawartoscPrzesylkiZagranicznejEnum zawartoscPrzesylki;
    protected List<DokumentyTowarzyszaceType> dokumentyTowarzyszace;
    protected String wyjasnienie;
    protected String oplatyPocztowe;
    protected String uwagi;
    protected String numerReferencyjnyImportera;
    protected String numerTelefonuImportera;
    @XmlElement(required = true)
    protected String walutaKodISO;
    @XmlElement(required = true)
    protected List<SzczegolyZawartosciPrzesylkiZagranicznejType> szczegolyZawartosciPrzesylki;
    protected String numerReferencyjnyCelny;

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracaCelnaRodzajEnum }
     *     
     */
    public DeklaracaCelnaRodzajEnum getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracaCelnaRodzajEnum }
     *     
     */
    public void setRodzaj(DeklaracaCelnaRodzajEnum value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the zawartoscPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link ZawartoscPrzesylkiZagranicznejEnum }
     *     
     */
    public ZawartoscPrzesylkiZagranicznejEnum getZawartoscPrzesylki() {
        return zawartoscPrzesylki;
    }

    /**
     * Sets the value of the zawartoscPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZawartoscPrzesylkiZagranicznejEnum }
     *     
     */
    public void setZawartoscPrzesylki(ZawartoscPrzesylkiZagranicznejEnum value) {
        this.zawartoscPrzesylki = value;
    }

    /**
     * Gets the value of the dokumentyTowarzyszace property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dokumentyTowarzyszace property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDokumentyTowarzyszace().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DokumentyTowarzyszaceType }
     * 
     * 
     */
    public List<DokumentyTowarzyszaceType> getDokumentyTowarzyszace() {
        if (dokumentyTowarzyszace == null) {
            dokumentyTowarzyszace = new ArrayList<DokumentyTowarzyszaceType>();
        }
        return this.dokumentyTowarzyszace;
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
     * Gets the value of the walutaKodISO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalutaKodISO() {
        return walutaKodISO;
    }

    /**
     * Sets the value of the walutaKodISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalutaKodISO(String value) {
        this.walutaKodISO = value;
    }

    /**
     * Gets the value of the szczegolyZawartosciPrzesylki property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the szczegolyZawartosciPrzesylki property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSzczegolyZawartosciPrzesylki().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SzczegolyZawartosciPrzesylkiZagranicznejType }
     * 
     * 
     */
    public List<SzczegolyZawartosciPrzesylkiZagranicznejType> getSzczegolyZawartosciPrzesylki() {
        if (szczegolyZawartosciPrzesylki == null) {
            szczegolyZawartosciPrzesylki = new ArrayList<SzczegolyZawartosciPrzesylkiZagranicznejType>();
        }
        return this.szczegolyZawartosciPrzesylki;
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

}
