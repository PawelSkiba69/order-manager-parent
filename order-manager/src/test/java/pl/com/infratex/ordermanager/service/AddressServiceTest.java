package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.web.model.AddressModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressServiceTest {

    private static final long O_ID_1 = 1L;
    private static final long O_ID_2 = 2L;
    private static final long O_ID_3 = 3L;
    private static final String GUID_1 = "92ry298n9820";
    private static final String GUID_2 = "iuahe938dn24";
    private static final String GUID_3 = "1sry138nfs20";

    @Test
    void assignGuids() {
        //Given
        AddressService addressService = new AddressService(null, null);
        //When
        List<String> guids = asList(GUID_1, GUID_2, GUID_3);
        List<AddressModel> addressesWithGuids = asList(
                AddressModel.builder().oId(O_ID_1).build(),
                AddressModel.builder().oId(O_ID_2).build(),
                AddressModel.builder().oId(O_ID_3).build());

        addressService.assignGuids(guids, addressesWithGuids);
        //Then
        assertAll(
                () -> assertEquals(guids.get(0), addressesWithGuids.get(0).getGuid()),
                () -> assertEquals(guids.get(1), addressesWithGuids.get(1).getGuid()),
                () -> assertEquals(guids.get(2), addressesWithGuids.get(2).getGuid())
        );
    }
}