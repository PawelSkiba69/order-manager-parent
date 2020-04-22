package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.dao.entity.AddressEntity;
import pl.com.infratex.ordermanager.dao.repository.AddressRepository;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShipmentManagerServiceTest {

    @Autowired
    private ShipmentManagerService shipmentManagerService;

    @Autowired
    private AddressRepository addressRepository;

    @Test
    void givenAddressModel_whenGenerateAndRemoveCorrectedAddresses_thenAddressesTableEmpty() {
        //given
        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("INF0001")
                .build();
        OrderModel orderModel = OrderModel.builder()
                .orderId("9482702802223")
                .product(productModel)
                .build();
        ClientModel clientModel=new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("Polska");
        orderModel.setClient(clientModel);
        List<OrderModel> orders = asList(
                orderModel
        );
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel(orders,null);
        //when
        shipmentManagerService.generateCorrectedAddresses(sellerOrderReportModel);
        shipmentManagerService.removeCorrectedAddresses(sellerOrderReportModel);
//        then
        List<AddressEntity> addressEntities = addressRepository.findAll();
        assertEquals(0,addressEntities.size());
    }

    @Test
    void givenAddressModel_whenGenerateCorrectedAddresses_thenAddressesTableContainsSingleRow(){
        //given
        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("INF0001")
                .build();
        OrderModel orderModel = OrderModel.builder()
                .orderId("9482702802223")
                .product(productModel)
                .build();
        ClientModel clientModel=new ClientModel();
        clientModel.setRecipientName("Janusz");
        clientModel.setShipAddress1("Brzozowa 10");
        clientModel.setShipAddress2("lokal 3");
        clientModel.setShipCity("Warszawa");
        clientModel.setShipPostalCode("34-233");
        clientModel.setShipCountry("Polska");
        orderModel.setClient(clientModel);
        List<OrderModel> orders = asList(
                orderModel
        );
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel(orders,null);
        //when
        shipmentManagerService.generateCorrectedAddresses(sellerOrderReportModel);
        List<AddressEntity> addressEntities = addressRepository.findAll();
        assertEquals(sellerOrderReportModel.getOrders().size(),addressEntities.size());
    }
}