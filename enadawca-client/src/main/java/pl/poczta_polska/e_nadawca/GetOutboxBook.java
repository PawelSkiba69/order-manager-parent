
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="includeNierejestrowane" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idEnvelope",
    "includeNierejestrowane"
})
@XmlRootElement(name = "getOutboxBook")
public class GetOutboxBook {

    protected int idEnvelope;
    protected Boolean includeNierejestrowane;

    /**
     * Gets the value of the idEnvelope property.
     * 
     */
    public int getIdEnvelope() {
        return idEnvelope;
    }

    /**
     * Sets the value of the idEnvelope property.
     * 
     */
    public void setIdEnvelope(int value) {
        this.idEnvelope = value;
    }

    /**
     * Gets the value of the includeNierejestrowane property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNierejestrowane() {
        return includeNierejestrowane;
    }

    /**
     * Sets the value of the includeNierejestrowane property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNierejestrowane(Boolean value) {
        this.includeNierejestrowane = value;
    }

}
