package pl.com.infratex.ordermanager.service.mapper;

import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;

import static org.junit.jupiter.api.Assertions.*;

class OrderModelMapperTest {

    @Test
    void fromModel() {
        //given
        OrderModelMapper orderModelMapper=new OrderModelMapper();
        ProductModel productModel=ProductModel.builder()
                .internalId("P732")
                .build();
        OrderModel orderModel=OrderModel.builder()
                .orderId("3985202438230")
                .product(productModel)
                .build();
        //when
        OrderEntity orderEntity = orderModelMapper.fromModel(orderModel);
        //then
        assertNotNull(orderEntity,"orderEntity is null");
    }

    @Test
    void fromModel2() {
        //given
        OrderModelMapper orderModelMapper=new OrderModelMapper();
        ProductModel productModel=ProductModel.builder()
                .internalId("P732")
                .build();
        OrderModel orderModel=OrderModel.builder()
                .orderId("3985202438230")
                .generatedAddress(true)
                .product(productModel)
                .build();
        //when
        OrderEntity orderEntity = orderModelMapper.fromModel(orderModel);
        //then
        assertTrue(orderEntity.isBusinessOrder(),"generated address is false");
    }
}