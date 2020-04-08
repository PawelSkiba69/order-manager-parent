
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="includeNierejestrowane" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
