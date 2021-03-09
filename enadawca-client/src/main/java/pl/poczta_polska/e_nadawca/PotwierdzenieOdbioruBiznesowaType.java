
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for potwierdzenieOdbioruBiznesowaType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="potwierdzenieOdbioruBiznesowaType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ilosc" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobPrzekazaniaPotwierdzeniaBiznesowaType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieOdbioruBiznesowaType", propOrder = {
    "ilosc",
    "sposob"
})
public class PotwierdzenieOdbioruBiznesowaType {

    protected Integer ilosc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SposobPrzekazaniaPotwierdzeniaBiznesowaType sposob;

    /**
     * Gets the value of the ilosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlosc(Integer value) {
        this.ilosc = value;
    }

    /**
     * Gets the value of the sposob property.
     * 
     * @return
     *     possible object is
     *     {@link SposobPrzekazaniaPotwierdzeniaBiznesowaType }
     *     
     */
    public SposobPrzekazaniaPotwierdzeniaBiznesowaType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPrzekazaniaPotwierdzeniaBiznesowaType }
     *     
     */
    public void setSposob(SposobPrzekazaniaPotwierdzeniaBiznesowaType value) {
        this.sposob = value;
    }

}
