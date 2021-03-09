
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for relatedToAllegroChannelType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="relatedToAllegroChannelType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MS"/&amp;gt;
 *     &amp;lt;enumeration value="WEB_API"/&amp;gt;
 *     &amp;lt;enumeration value="REST_API"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
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
