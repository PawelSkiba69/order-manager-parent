
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for rozstrzygniecieType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="rozstrzygniecieType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="UZASADNIONA"/&amp;gt;
 *     &amp;lt;enumeration value="NIEUZASADNIONA"/&amp;gt;
 *     &amp;lt;enumeration value="NIEWNIESIONA"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "rozstrzygniecieType")
@XmlEnum
public enum RozstrzygniecieType {

    UZASADNIONA,
    NIEUZASADNIONA,
    NIEWNIESIONA;

    public String value() {
        return name();
    }

    public static RozstrzygniecieType fromValue(String v) {
        return valueOf(v);
    }

}
