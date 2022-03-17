
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trasaResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trasaResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isMiejscowa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trasaResponseType", propOrder = {
    "isMiejscowa",
    "guid"
})
public class TrasaResponseType {

    protected boolean isMiejscowa;
    @XmlElement(required = true)
    protected String guid;

    /**
     * Gets the value of the isMiejscowa property.
     * 
     */
    public boolean isIsMiejscowa() {
        return isMiejscowa;
    }

    /**
     * Sets the value of the isMiejscowa property.
     * 
     */
    public void setIsMiejscowa(boolean value) {
        this.isMiejscowa = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
