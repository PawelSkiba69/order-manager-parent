package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.dao.entity.AddressEntity;
import pl.com.infratex.ordermanager.dao.repository.AddressRepository;
import pl.com.infratex.ordermanager.service.mapper.AddressModelMapper;
import pl.com.infratex.ordermanager.web.model.AddressModel;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AddressService {

    private static final Logger LOGGER = Logger.getLogger(AddressService.class.getName());
    private AddressRepository addressRepository;
    private AddressModelMapper addressModelMapper;

    public AddressService(AddressRepository addressRepository, AddressModelMapper addressModelMapper) {
        this.addressRepository = addressRepository;
        this.addressModelMapper = addressModelMapper;
    }

    public void saveAll(List<AddressModel> addressModels) {
        addressModels.forEach(addressModel -> {
            AddressEntity addressEntity = addressModelMapper.fromModel(addressModel);
            addressRepository.save(addressEntity);
        });
    }

    public void deleteAll(List<AddressModel> addressModels) {
        addressRepository.deleteAll();
    }

    public List<AddressModel> list() {
        // TODO AddressRepository find by address status is GENERATE
        List<AddressEntity> addressEntities = addressRepository.findByOrderByInternalIdDesc();
        return addressModelMapper.fromEntities(addressEntities);
    }

    public List<AddressModel> assignGuids(List<String> guids, List<AddressModel> addresses) {
        LOGGER.info("assignGuids()");
        int counter = 0;
        for (AddressModel address : addresses) {
            address.setGuid(guids.get(counter));
            counter++;
            LOGGER.info("adres"+"\t"+address.getOrderId()+"\t"+address.getRecipientName()+"\t"
            +address.getShipAddress1()+"\t"+address.getShipAddress2()+"\t"+address.getShipPostalCode()
            +"\t"+address.getShipCity()+"\t"+address.getShipCountry());
        }
//        LOGGER.info("#### "+addresses);
        return addresses;
    }
}
