
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for przesylkaFullType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="przesylkaFullType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="przesylkaShort" type="{http://e-nadawca.poczta-polska.pl}przesylkaShortType"/&amp;gt;
 *         &amp;lt;element name="przesylkaFull" type="{http://e-nadawca.poczta-polska.pl}przesylkaType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaFullType", propOrder = {
    "przesylkaShort",
    "przesylkaFull"
})
public class PrzesylkaFullType {

    @XmlElement(required = true)
    protected PrzesylkaShortType przesylkaShort;
    @XmlElement(required = true)
    protected PrzesylkaType przesylkaFull;

    /**
     * Gets the value of the przesylkaShort property.
     * 
     * @return
     *     possible object is
     *     {@link PrzesylkaShortType }
     *     
     */
    public PrzesylkaShortType getPrzesylkaShort() {
        return przesylkaShort;
    }

    /**
     * Sets the value of the przesylkaShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrzesylkaShortType }
     *     
     */
    public void setPrzesylkaShort(PrzesylkaShortType value) {
        this.przesylkaShort = value;
    }

    /**
     * Gets the value of the przesylkaFull property.
     * 
     * @return
     *     possible object is
     *     {@link PrzesylkaType }
     *     
     */
    public PrzesylkaType getPrzesylkaFull() {
        return przesylkaFull;
    }

    /**
     * Sets the value of the przesylkaFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrzesylkaType }
     *     
     */
    public void setPrzesylkaFull(PrzesylkaType value) {
        this.przesylkaFull = value;
    }

}
