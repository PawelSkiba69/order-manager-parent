
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kierunekType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kierunekType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodPocztowy" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="opis" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pna" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kierunekType", propOrder = {
    "kodPocztowy"
})
public class KierunekType {

    protected List<String> kodPocztowy;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "pna")
    protected String pna;

    /**
     * Gets the value of the kodPocztowy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kodPocztowy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKodPocztowy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKodPocztowy() {
        if (kodPocztowy == null) {
            kodPocztowy = new ArrayList<String>();
        }
        return this.kodPocztowy;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the pna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPna() {
        return pna;
    }

    /**
     * Sets the value of the pna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPna(String value) {
        this.pna = value;
    }

}
