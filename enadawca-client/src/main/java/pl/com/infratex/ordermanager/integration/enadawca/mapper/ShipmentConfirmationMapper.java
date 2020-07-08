package pl.com.infratex.ordermanager.integration.enadawca.mapper;

import pl.com.infratex.ordermanager.enadawca.ShipmentConfirmationModel;
import pl.poczta_polska.e_nadawca.PrzesylkaShortType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShipmentConfirmationMapper {
    public List<ShipmentConfirmationModel> map(List <PrzesylkaShortType> przesylkaShortTypes){
        return przesylkaShortTypes.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
    public ShipmentConfirmationModel map(PrzesylkaShortType przesylkaShortType){
        return null;
    }
}
