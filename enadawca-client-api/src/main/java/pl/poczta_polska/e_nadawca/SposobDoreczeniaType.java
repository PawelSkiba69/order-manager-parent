
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobDoreczeniaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sposobDoreczeniaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identyfikatorPunktuOdbioru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sposobDoreczeniaType", propOrder = {
    "kod",
    "identyfikatorPunktuOdbioru"
})
public class SposobDoreczeniaType {

    @XmlElement(required = true)
    protected String kod;
    protected String identyfikatorPunktuOdbioru;

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the identyfikatorPunktuOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorPunktuOdbioru() {
        return identyfikatorPunktuOdbioru;
    }

    /**
     * Sets the value of the identyfikatorPunktuOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorPunktuOdbioru(String value) {
        this.identyfikatorPunktuOdbioru = value;
    }

}
