
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for permisionType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="permisionType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_USERS"/&amp;gt;
 *     &amp;lt;enumeration value="TRANSMIT"/&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_PROFILES"/&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_ORGANIZATION_UNIT"/&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_TEMPLATES"/&amp;gt;
 *     &amp;lt;enumeration value="EDIT_PARCELS"/&amp;gt;
 *     &amp;lt;enumeration value="EDIT_PARCELS_FROM_TEMPLATES"/&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_ADDRESS_BOOK"/&amp;gt;
 *     &amp;lt;enumeration value="SAVE_SELF_SETTINGS"/&amp;gt;
 *     &amp;lt;enumeration value="MANAGE_DICTIONARIES"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "permisionType")
@XmlEnum
public enum PermisionType {

    MANAGE_USERS,
    TRANSMIT,
    MANAGE_PROFILES,
    MANAGE_ORGANIZATION_UNIT,
    MANAGE_TEMPLATES,
    EDIT_PARCELS,
    EDIT_PARCELS_FROM_TEMPLATES,
    MANAGE_ADDRESS_BOOK,
    SAVE_SELF_SETTINGS,
    MANAGE_DICTIONARIES;

    public String value() {
        return name();
    }

    public static PermisionType fromValue(String v) {
        return valueOf(v);
    }

}
