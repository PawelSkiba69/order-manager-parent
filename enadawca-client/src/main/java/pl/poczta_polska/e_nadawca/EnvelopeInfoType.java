
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for envelopeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="envelopeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://e-nadawca.poczta-polska.pl}errorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="envelopeStatus" type="{http://e-nadawca.poczta-polska.pl}envelopeStatusType" /&gt;
 *       &lt;attribute name="dataTransmisji" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envelopeInfoType", propOrder = {
    "error"
})
public class EnvelopeInfoType {

    protected List<ErrorType> error;
    @XmlAttribute(name = "idEnvelope")
    protected Integer idEnvelope;
    @XmlAttribute(name = "envelopeStatus")
    protected EnvelopeStatusType envelopeStatus;
    @XmlAttribute(name = "dataTransmisji")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTransmisji;

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * Gets the value of the dataTransmisji property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransmisji() {
        return dataTransmisji;
    }

    /**
     * Sets the value of the dataTransmisji property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransmisji(XMLGregorianCalendar value) {
        this.dataTransmisji = value;
    }

    @Override
    public String toString() {
        return "EnvelopeInfoType{" +
                "error=" + error +
                ", idEnvelope=" + idEnvelope +
                ", envelopeStatus=" + envelopeStatus +
                ", dataTransmisji=" + dataTransmisji +
                '}';
    }
}
