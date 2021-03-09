
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for sendEnvelopeResponseType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="sendEnvelopeResponseType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="envelopeStatus" type="{http://e-nadawca.poczta-polska.pl}envelopeStatusType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="error" type="{http://e-nadawca.poczta-polska.pl}errorType" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="envelopeFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEnvelopeResponseType", propOrder = {
    "idEnvelope",
    "envelopeStatus",
    "error",
    "envelopeFilename"
})
public class SendEnvelopeResponseType {

    protected Integer idEnvelope;
    @XmlSchemaType(name = "string")
    protected EnvelopeStatusType envelopeStatus;
    protected List<ErrorType> error;
    protected String envelopeFilename;

    /**
     * Gets the value of the idEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEnvelope() {
        return idEnvelope;
    }

    /**
     * Sets the value of the idEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEnvelope(Integer value) {
        this.idEnvelope = value;
    }

    /**
     * Gets the value of the envelopeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeStatusType }
     *     
     */
    public EnvelopeStatusType getEnvelopeStatus() {
        return envelopeStatus;
    }

    /**
     * Sets the value of the envelopeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeStatusType }
     *     
     */
    public void setEnvelopeStatus(EnvelopeStatusType value) {
        this.envelopeStatus = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the error property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getError().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the envelopeFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeFilename() {
        return envelopeFilename;
    }

    /**
     * Sets the value of the envelopeFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeFilename(String value) {
        this.envelopeFilename = value;
    }

}
