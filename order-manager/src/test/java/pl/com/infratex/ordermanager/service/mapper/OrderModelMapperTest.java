package pl.com.infratex.ordermanager.service.mapper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.dao.entity.ClientEntity;
import pl.com.infratex.ordermanager.dao.entity.OrderEntity;
import pl.com.infratex.ordermanager.dao.entity.ProductEntity;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderModelMapperTest {
    private OrderModelMapper orderModelMapper;;

    @BeforeEach
    public void setUp() {
        orderModelMapper = new OrderModelMapper();
    }

    @AfterEach
    public void tearDown() {
        orderModelMapper = null;
    }

    @Test
    void fromModel() {
        //given

        orderModelMapper = new OrderModelMapper();
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

    @Test
    void givenOrderEntity_whenFromEntity_thenOrderModelMapped() {
        // given
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setoId(23L);

        ProductEntity productEntity = new ProductEntity();
        ClientEntity clientEntity= new ClientEntity();

        orderEntity.setProduct(productEntity);
        orderEntity.setClient(clientEntity);

        // when
        OrderModel orderModel = orderModelMapper.fromEntity(orderEntity);

        // then
        assertAll(
                () -> assertNotNull(orderModel, "orderModel is NULL"),
                () -> assertNotNull(orderModel.getProduct(), "orderModel Product is NULL"),
                () -> assertNotNull(orderModel.getClient(), "orderModel Client is NULL")
        );
    }
}