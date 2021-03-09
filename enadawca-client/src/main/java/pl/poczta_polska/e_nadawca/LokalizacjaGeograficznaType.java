
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for lokalizacjaGeograficznaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="lokalizacjaGeograficznaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="dlugosc" type="{http://e-nadawca.poczta-polska.pl}wspolrzednaGeograficznaType"/&amp;gt;
 *         &amp;lt;element name="szerokosc" type="{http://e-nadawca.poczta-polska.pl}wspolrzednaGeograficznaType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lokalizacjaGeograficznaType", propOrder = {
    "dlugosc",
    "szerokosc"
})
public class LokalizacjaGeograficznaType {

    @XmlElement(required = true)
    protected WspolrzednaGeograficznaType dlugosc;
    @XmlElement(required = true)
    protected WspolrzednaGeograficznaType szerokosc;

    /**
     * Gets the value of the dlugosc property.
     * 
     * @return
     *     possible object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public WspolrzednaGeograficznaType getDlugosc() {
        return dlugosc;
    }

    /**
     * Sets the value of the dlugosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public void setDlugosc(WspolrzednaGeograficznaType value) {
        this.dlugosc = value;
    }

    /**
     * Gets the value of the szerokosc property.
     * 
     * @return
     *     possible object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public WspolrzednaGeograficznaType getSzerokosc() {
        return szerokosc;
    }

    /**
     * Sets the value of the szerokosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public void setSzerokosc(WspolrzednaGeograficznaType value) {
        this.szerokosc = value;
    }

}
