
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" maxOccurs="500"/&gt;
 *         &lt;element name="endedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="withBioepo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "guid",
    "endedOnly",
    "idEnvelope"
})
@XmlRootElement(name = "getEPOStatus")
public class GetEPOStatus {

    @XmlElement(required = true)
    protected List<String> guid;
    protected boolean endedOnly;
    protected int idEnvelope;
    @XmlAttribute(name = "withBioepo")
    protected Boolean withBioepo;

    /**
     * Gets the value of the guid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGuid() {
        if (guid == null) {
            guid = new ArrayList<String>();
        }
        return this.guid;
    }

    /**
     * Gets the value of the endedOnly property.
     * 
     */
    public boolean isEndedOnly() {
        return endedOnly;
    }

    /**
     * Sets the value of the endedOnly property.
     * 
     */
    public void setEndedOnly(boolean value) {
        this.endedOnly = value;
    }

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
     * Gets the value of the withBioepo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithBioepo() {
        return withBioepo;
    }

    /**
     * Sets the value of the withBioepo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithBioepo(Boolean value) {
        this.withBioepo = value;
    }

}
