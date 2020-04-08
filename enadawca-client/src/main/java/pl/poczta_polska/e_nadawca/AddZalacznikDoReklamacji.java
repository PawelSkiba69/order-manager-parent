
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idReklamacja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zalacznik" type="{http://e-nadawca.poczta-polska.pl}zalacznikDoReklamacjiType" maxOccurs="5"/&gt;
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
    "idReklamacja",
    "zalacznik"
})
@XmlRootElement(name = "addZalacznikDoReklamacji")
public class AddZalacznikDoReklamacji {

    @XmlElement(required = true)
    protected String idReklamacja;
    @XmlElement(required = true)
    protected List<ZalacznikDoReklamacjiType> zalacznik;

    /**
     * Gets the value of the idReklamacja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReklamacja() {
        return idReklamacja;
    }

    /**
     * Sets the value of the idReklamacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReklamacja(String value) {
        this.idReklamacja = value;
    }

    /**
     * Gets the value of the zalacznik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zalacznik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZalacznik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZalacznikDoReklamacjiType }
     * 
     * 
     */
    public List<ZalacznikDoReklamacjiType> getZalacznik() {
        if (zalacznik == null) {
            zalacznik = new ArrayList<ZalacznikDoReklamacjiType>();
        }
        return this.zalacznik;
    }

}
