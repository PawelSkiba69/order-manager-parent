
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potwierdzenieOdbioruBiznesowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potwierdzenieOdbioruBiznesowaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilosc" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" minOccurs="0"/&gt;
 *         &lt;element name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobPrzekazaniaPotwierdzeniaBiznesowaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
