
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kategoriePowodowReklamacjiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kategoriePowodowReklamacjiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="powodReklamacji" type="{http://e-nadawca.poczta-polska.pl}powodReklamacjiType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kategoriePowodowReklamacjiType", propOrder = {
    "nazwa",
    "powodReklamacji"
})
public class KategoriePowodowReklamacjiType {

    @XmlElement(required = true)
    protected String nazwa;
    @XmlElement(required = true)
    protected List<PowodReklamacjiType> powodReklamacji;

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the powodReklamacji property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powodReklamacji property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowodReklamacji().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowodReklamacjiType }
     * 
     * 
     */
    public List<PowodReklamacjiType> getPowodReklamacji() {
        if (powodReklamacji == null) {
            powodReklamacji = new ArrayList<PowodReklamacjiType>();
        }
        return this.powodReklamacji;
    }

}
