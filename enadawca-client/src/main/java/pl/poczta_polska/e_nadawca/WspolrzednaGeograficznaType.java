
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wspolrzednaGeograficznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wspolrzednaGeograficznaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="dec" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="stopien" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="minuta" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="sekunda" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wspolrzednaGeograficznaType")
public class WspolrzednaGeograficznaType {

    @XmlAttribute(name = "dec")
    protected Float dec;
    @XmlAttribute(name = "stopien")
    protected Integer stopien;
    @XmlAttribute(name = "minuta")
    protected Integer minuta;
    @XmlAttribute(name = "sekunda")
    protected Float sekunda;

    /**
     * Gets the value of the dec property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDec() {
        return dec;
    }

    /**
     * Sets the value of the dec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDec(Float value) {
        this.dec = value;
    }

    /**
     * Gets the value of the stopien property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStopien() {
        return stopien;
    }

    /**
     * Sets the value of the stopien property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStopien(Integer value) {
        this.stopien = value;
    }

    /**
     * Gets the value of the minuta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinuta() {
        return minuta;
    }

    /**
     * Sets the value of the minuta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinuta(Integer value) {
        this.minuta = value;
    }

    /**
     * Gets the value of the sekunda property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSekunda() {
        return sekunda;
    }

    /**
     * Sets the value of the sekunda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSekunda(Float value) {
        this.sekunda = value;
    }

}
