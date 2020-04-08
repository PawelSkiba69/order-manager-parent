
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EZDOPakietType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EZDOPakietType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="idEZDOPakiet" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="exported" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="idEZDOFile" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EZDOPakietType")
public class EZDOPakietType {

    @XmlAttribute(name = "idEZDOPakiet")
    protected Integer idEZDOPakiet;
    @XmlAttribute(name = "exported")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exported;
    @XmlAttribute(name = "idEZDOFile")
    protected String idEZDOFile;

    /**
     * Gets the value of the idEZDOPakiet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEZDOPakiet() {
        return idEZDOPakiet;
    }

    /**
     * Sets the value of the idEZDOPakiet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEZDOPakiet(Integer value) {
        this.idEZDOPakiet = value;
    }

    /**
     * Gets the value of the exported property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExported() {
        return exported;
    }

    /**
     * Sets the value of the exported property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExported(XMLGregorianCalendar value) {
        this.exported = value;
    }

    /**
     * Gets the value of the idEZDOFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEZDOFile() {
        return idEZDOFile;
    }

    /**
     * Sets the value of the idEZDOFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEZDOFile(String value) {
        this.idEZDOFile = value;
    }

}
