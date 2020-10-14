package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {
    private String buyerEmail;
    private String buyerName;
    private String buyerPhone;
    private String recipientName;
    private String shipAddress1;
    private String shipAddress2;
    private String shipAddress3;
    private String shipCity;
    private String shipState;
    private String shipPostalCode;
    private String shipCountry;
    private String shipPhoneNumber;
}
