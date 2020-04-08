package pl.com.infratex.ordermanager.service.mapper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.service.csv.processor.AmazonCsvProcessorSampleDataTest;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.IOException;
import java.util.List;

class SellerOrderReportMapperTest {

    public static final String ORDER_ID = "123";
    public static final String PRODUCT_NAME = "Telecomando";
    public static final String BUYER_EMAIL = "src@e-mail.com";
    private SellerOrderReportMapper sellerOrderReportMapper;

    @BeforeEach
    public void setUp() {
        sellerOrderReportMapper = new SellerOrderReportMapper();
    }

    @AfterEach
    public void tearDown() {
        sellerOrderReportMapper = null;
    }

    @Test
    void fromAmazonCsvOrders() throws IOException {
        //given
        List<AmazonCsvOrder> amazonCsvOrders = AmazonCsvProcessorSampleDataTest.parseCsv();
        //when
        SellerOrderReportModel sellerOrderReportModel = sellerOrderReportMapper.fromAmazonCsvOrders(amazonCsvOrders);
        //then
        System.out.println(sellerOrderReportModel);
    }

    @Test
    void fromAmazonCsvOrderToOrderModel() {
        //given
        AmazonCsvOrder amazonCsvOrder = new AmazonCsvOrder();
        amazonCsvOrder.setOrderId(ORDER_ID);
        //when
        OrderModel orderModel = sellerOrderReportMapper.fromAmazonCsvOrderToOrderModel(amazonCsvOrder);
        //then
//        assertEquals(ORDER_ID, orderModel.getOrderId(), "order id not equal");
    }

    @Test
    void fromAmazonCsvOrderToProductModel() {
        //given
        AmazonCsvOrder amazonCsvOrder = new AmazonCsvOrder();
        amazonCsvOrder.setProductName(PRODUCT_NAME);
        //when
        ProductModel productModel = sellerOrderReportMapper.fromAmazonCsvOrderToProductModel(amazonCsvOrder);
        //then
        System.out.println(productModel);
    }

    @Test
    void fromAmazonCsvOrderToClientModel() {
        //given
        AmazonCsvOrder amazonCsvOrder = new AmazonCsvOrder();
        amazonCsvOrder.setBuyerEmail(BUYER_EMAIL);
        //when
        ClientModel clientModel = sellerOrderReportMapper.fromAmazonCsvOrderToClientModel(amazonCsvOrder);
        //then
        System.out.println(clientModel);
    }
}