
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for PrintMethodEnum.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="PrintMethodEnum"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="EACH_PARCEL_SEPARATELY"/&amp;gt;
 *     &amp;lt;enumeration value="ALL_PARCELS_IN_ONE_FILE"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "PrintMethodEnum")
@XmlEnum
public enum PrintMethodEnum {

    EACH_PARCEL_SEPARATELY,
    ALL_PARCELS_IN_ONE_FILE;

    public String value() {
        return name();
    }

    public static PrintMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}
