
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for paletaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="paletaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="rodzajPalety" type="{http://e-nadawca.poczta-polska.pl}rodzajPaletyType" /&amp;gt;
 *       &amp;lt;attribute name="szerokosc" type="{http://www.w3.org/2001/XMLSchema}int" /&amp;gt;
 *       &amp;lt;attribute name="dlugosc" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="wysokosc" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paletaType")
public class PaletaType {

    @XmlAttribute(name = "rodzajPalety")
    protected RodzajPaletyType rodzajPalety;
    @XmlAttribute(name = "szerokosc")
    protected Integer szerokosc;
    @XmlAttribute(name = "dlugosc")
    protected String dlugosc;
    @XmlAttribute(name = "wysokosc")
    protected String wysokosc;

    /**
     * Gets the value of the rodzajPalety property.
     * 
     * @return
     *     possible object is
     *     {@link RodzajPaletyType }
     *     
     */
    public RodzajPaletyType getRodzajPalety() {
        return rodzajPalety;
    }

    /**
     * Sets the value of the rodzajPalety property.
     * 
     * @param value
     *     allowed object is
     *     {@link RodzajPaletyType }
     *     
     */
    public void setRodzajPalety(RodzajPaletyType value) {
        this.rodzajPalety = value;
    }

    /**
     * Gets the value of the szerokosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSzerokosc() {
        return szerokosc;
    }

    /**
     * Sets the value of the szerokosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSzerokosc(Integer value) {
        this.szerokosc = value;
    }

    /**
     * Gets the value of the dlugosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlugosc() {
        return dlugosc;
    }

    /**
     * Sets the value of the dlugosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlugosc(String value) {
        this.dlugosc = value;
    }

    /**
     * Gets the value of the wysokosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWysokosc() {
        return wysokosc;
    }

    /**
     * Sets the value of the wysokosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWysokosc(String value) {
        this.wysokosc = value;
    }

}
