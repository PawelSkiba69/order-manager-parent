
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for szczegolyDeklaracjiCelnejType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="szczegolyDeklaracjiCelnejType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ilosc" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="masa" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="wartosc" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="numerTaryfowy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="krajPochodzenia" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "szczegolyDeklaracjiCelnejType")
public class SzczegolyDeklaracjiCelnejType {

    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "ilosc")
    protected Float ilosc;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "numerTaryfowy")
    protected String numerTaryfowy;
    @XmlAttribute(name = "krajPochodzenia")
    protected String krajPochodzenia;

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
     * Gets the value of the ilosc property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIlosc(Float value) {
        this.ilosc = value;
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
     * Gets the value of the numerTaryfowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTaryfowy() {
        return numerTaryfowy;
    }

    /**
     * Sets the value of the numerTaryfowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTaryfowy(String value) {
        this.numerTaryfowy = value;
    }

    /**
     * Gets the value of the krajPochodzenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    /**
     * Sets the value of the krajPochodzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrajPochodzenia(String value) {
        this.krajPochodzenia = value;
    }

}
