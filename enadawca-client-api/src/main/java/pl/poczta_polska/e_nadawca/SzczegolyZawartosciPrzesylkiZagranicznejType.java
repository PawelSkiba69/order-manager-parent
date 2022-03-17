
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SzczegolyZawartosciPrzesylkiZagranicznejType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SzczegolyZawartosciPrzesylkiZagranicznejType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="okreslenieZawartosci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilosc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="masaNetto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="wartosc" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="numerTaryfyHs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="krajPochodzeniaKodAlfa2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SzczegolyZawartosciPrzesylkiZagranicznejType", propOrder = {
    "okreslenieZawartosci",
    "ilosc",
    "masaNetto",
    "wartosc",
    "numerTaryfyHs",
    "krajPochodzeniaKodAlfa2"
})
public class SzczegolyZawartosciPrzesylkiZagranicznejType {

    @XmlElement(required = true)
    protected String okreslenieZawartosci;
    protected int ilosc;
    protected Integer masaNetto;
    protected float wartosc;
    protected String numerTaryfyHs;
    protected String krajPochodzeniaKodAlfa2;

    /**
     * Gets the value of the okreslenieZawartosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkreslenieZawartosci() {
        return okreslenieZawartosci;
    }

    /**
     * Sets the value of the okreslenieZawartosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkreslenieZawartosci(String value) {
        this.okreslenieZawartosci = value;
    }

    /**
     * Gets the value of the ilosc property.
     * 
     */
    public int getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     */
    public void setIlosc(int value) {
        this.ilosc = value;
    }

    /**
     * Gets the value of the masaNetto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasaNetto() {
        return masaNetto;
    }

    /**
     * Sets the value of the masaNetto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasaNetto(Integer value) {
        this.masaNetto = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     */
    public float getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     */
    public void setWartosc(float value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the numerTaryfyHs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTaryfyHs() {
        return numerTaryfyHs;
    }

    /**
     * Sets the value of the numerTaryfyHs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTaryfyHs(String value) {
        this.numerTaryfyHs = value;
    }

    /**
     * Gets the value of the krajPochodzeniaKodAlfa2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrajPochodzeniaKodAlfa2() {
        return krajPochodzeniaKodAlfa2;
    }

    /**
     * Sets the value of the krajPochodzeniaKodAlfa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrajPochodzeniaKodAlfa2(String value) {
        this.krajPochodzeniaKodAlfa2 = value;
    }

}
