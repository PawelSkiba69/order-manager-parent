
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrintType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PrintType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="kind" type="{http://e-nadawca.poczta-polska.pl}PrintKindEnum"/&amp;gt;
 *         &amp;lt;element name="method" type="{http://e-nadawca.poczta-polska.pl}PrintMethodEnum"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintType", propOrder = {
    "kind",
    "method"
})
public class PrintType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrintKindEnum kind;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PrintMethodEnum method;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link PrintKindEnum }
     *     
     */
    public PrintKindEnum getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintKindEnum }
     *     
     */
    public void setKind(PrintKindEnum value) {
        this.kind = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link PrintMethodEnum }
     *     
     */
    public PrintMethodEnum getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintMethodEnum }
     *     
     */
    public void setMethod(PrintMethodEnum value) {
        this.method = value;
    }

}
