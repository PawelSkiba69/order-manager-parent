
package pl.poczta_polska.e_nadawca;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="zapowiedzFakturyZipFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "zapowiedzFakturyZipFile"
})
@XmlRootElement(name = "getZapowiedziFakturResponse")
public class GetZapowiedziFakturResponse {

    protected List<byte[]> zapowiedzFakturyZipFile;

    /**
     * Gets the value of the zapowiedzFakturyZipFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zapowiedzFakturyZipFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZapowiedzFakturyZipFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getZapowiedzFakturyZipFile() {
        if (zapowiedzFakturyZipFile == null) {
            zapowiedzFakturyZipFile = new ArrayList<byte[]>();
        }
        return this.zapowiedzFakturyZipFile;
    }

}
