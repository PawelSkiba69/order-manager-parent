
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &amp;lt;element name="idBuforFrom" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="idBuforTo" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" maxOccurs="unbounded"/&amp;gt;
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
    "idBuforFrom",
    "idBuforTo",
    "guid"
})
@XmlRootElement(name = "moveShipments")
public class MoveShipments {

    protected int idBuforFrom;
    protected int idBuforTo;
    @XmlElement(required = true)
    protected List<String> guid;

    /**
     * Gets the value of the idBuforFrom property.
     * 
     */
    public int getIdBuforFrom() {
        return idBuforFrom;
    }

    /**
     * Sets the value of the idBuforFrom property.
     * 
     */
    public void setIdBuforFrom(int value) {
        this.idBuforFrom = value;
    }

    /**
     * Gets the value of the idBuforTo property.
     * 
     */
    public int getIdBuforTo() {
        return idBuforTo;
    }

    /**
     * Sets the value of the idBuforTo property.
     * 
     */
    public void setIdBuforTo(int value) {
        this.idBuforTo = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the guid property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getGuid().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

}
