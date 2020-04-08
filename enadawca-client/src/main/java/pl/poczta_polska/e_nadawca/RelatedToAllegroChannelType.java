
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for relatedToAllegroChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="relatedToAllegroChannelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="WEB_API"/&gt;
 *     &lt;enumeration value="REST_API"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "relatedToAllegroChannelType")
@XmlEnum
public enum RelatedToAllegroChannelType {

    MS,
    WEB_API,
    REST_API;

    public String value() {
        return name();
    }

    public static RelatedToAllegroChannelType fromValue(String v) {
        return valueOf(v);
    }

}
