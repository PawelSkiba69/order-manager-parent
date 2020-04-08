
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rozstrzygniecieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rozstrzygniecieType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UZASADNIONA"/&gt;
 *     &lt;enumeration value="NIEUZASADNIONA"/&gt;
 *     &lt;enumeration value="NIEWNIESIONA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
