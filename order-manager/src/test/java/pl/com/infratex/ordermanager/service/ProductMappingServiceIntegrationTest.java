package pl.com.infratex.ordermanager.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.com.infratex.ordermanager.dao.entity.ProductMappingEntity;
import pl.com.infratex.ordermanager.dao.repository.ProductMappingRepository;
import pl.com.infratex.ordermanager.service.csv.product.ProductMappingCsvProcessor;
import pl.com.infratex.ordermanager.service.mapper.ProductMappingMapper;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductMappingServiceIntegrationTest {

    public static final String SKU_INF_0001 = "INF0001";
    @Autowired
    private ProductMappingMapper productMappingMapper;
    @Autowired
    private ProductMappingRepository productMappingRepository;
    @Autowired
    private ProductMappingCsvProcessor productMappingCsvProcessor;

    @Test
    void givenProductWithSku_assignAdditionalProductInfo_thenOrdersNotNull() {
        //given
        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku("INF0001")
                .build();
        OrderModel orderModel = OrderModel.builder()
                .orderId("9482702802223")
                .product(productModel)
                .build();
        List<OrderModel> orders = asList(
                orderModel
        );
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel(orders,null);

        ProductMappingService productMappingService = new ProductMappingService(
                productMappingCsvProcessor, productMappingRepository, productMappingMapper);
        //when
        SellerOrderReportModel sellerOrderReportModelWithInternalProductIds =
                productMappingService.assignAdditionalProductInfo(sellerOrderReportModel);
        //then
        assertAll(
                () -> assertNotNull(sellerOrderReportModelWithInternalProductIds, "sellerOrderReportModel is null"),
                () -> assertNotNull(sellerOrderReportModelWithInternalProductIds.getOrders(), "orders are null")
        );

    }

    @Test
    void givenProductWithSku_assignAdditionalProductInfo_thenInternalIdNotNull() {
        //given
        ProductMappingEntity productMappingEntity = new ProductMappingEntity();
        productMappingEntity.setSku(SKU_INF_0001);
        productMappingEntity.setInternalProductName("p732");
        productMappingEntity.setAsin("A4802GNN490");
        productMappingEntity.setCondition("new");
        ProductMappingEntity savedProductMappingEntity = productMappingRepository.save(productMappingEntity);

        ProductModel productModel = ProductModel.builder()
                .productName("Remote control Grandin")
                .sku(SKU_INF_0001)
                .build();
        OrderModel orderModel = OrderModel.builder()
                .orderId("9482702802223")
                .product(productModel)
                .build();
        List<OrderModel> orders = asList(
                orderModel
        );
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel(orders,null);

        ProductMappingService productMappingService = new ProductMappingService(
                productMappingCsvProcessor, productMappingRepository, productMappingMapper);
        //when
        SellerOrderReportModel sellerOrderReportModelWithInternalProductIds =
                productMappingService.assignAdditionalProductInfo(sellerOrderReportModel);
        List<OrderModel> ordersWithInternalProductIds = sellerOrderReportModelWithInternalProductIds.getOrders();
        OrderModel orderModelWithInternalProductId = ordersWithInternalProductIds.get(0);
        ProductModel productWithInternalProductId = orderModelWithInternalProductId.getProduct();
        //then
        assertAll(
                () -> assertNotNull(productWithInternalProductId.getInternalId(), "internalId is null"),
                () -> assertNotNull(productWithInternalProductId.getAsin(), "asin is null"),
                () -> assertNotNull(productWithInternalProductId.getCondition(), "condition is null"),
                () -> assertEquals(savedProductMappingEntity.getSku(),productWithInternalProductId.getSku(),"sku's aren't equals")
        );

    }
}