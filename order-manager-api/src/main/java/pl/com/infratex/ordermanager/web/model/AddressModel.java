package pl.com.infratex.ordermanager.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.poczta_polska.e_nadawca.DeklaracaCelnaRodzajEnum;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressModel {

    private Long id;
    private Long oId;
    private String orderId;
    private String internalId;
    private String recipientName;
    private String shipAddress1;
    private String shipAddress2;
    private String shipAddress3;
    private String shipCity;
    private String shipState;
    private String shipPostalCode;
    private String shipCountry;
    private String shipPhoneNumber;
    private String guid;
    private String currency;
    private List<AddressContentsModel> addressContents=new ArrayList<>();
    private DeklaracaCelnaRodzajEnum deklaracaCelnaRodzaj;
}
