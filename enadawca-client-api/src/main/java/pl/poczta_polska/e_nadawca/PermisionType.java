
package pl.poczta_polska.e_nadawca;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="permisionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANAGE_USERS"/&gt;
 *     &lt;enumeration value="TRANSMIT"/&gt;
 *     &lt;enumeration value="MANAGE_PROFILES"/&gt;
 *     &lt;enumeration value="MANAGE_ORGANIZATION_UNIT"/&gt;
 *     &lt;enumeration value="MANAGE_TEMPLATES"/&gt;
 *     &lt;enumeration value="EDIT_PARCELS"/&gt;
 *     &lt;enumeration value="EDIT_PARCELS_FROM_TEMPLATES"/&gt;
 *     &lt;enumeration value="MANAGE_ADDRESS_BOOK"/&gt;
 *     &lt;enumeration value="SAVE_SELF_SETTINGS"/&gt;
 *     &lt;enumeration value="MANAGE_DICTIONARIES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
