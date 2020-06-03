package pl.com.infratex.ordermanager.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.api.OrderStatusType;
import pl.com.infratex.ordermanager.service.model.AmazonCsvOrder;
import pl.com.infratex.ordermanager.web.model.ClientModel;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SellerOrderReportMapper {
    public SellerOrderReportModel fromAmazonCsvOrders(List<AmazonCsvOrder> amazonCsvOrders) {
        SellerOrderReportModel sellerOrderReportModel = new SellerOrderReportModel();

        List<OrderModel> orders = amazonCsvOrders.stream()
                .map((this::fromAmazonCsvOrderToOrderModel))
//                .map((amazonCsvOrder -> fromAmazonCsvOrderToOrderModel(amazonCsvOrder)))
                .collect(Collectors.toList());
        sellerOrderReportModel.setOrders(orders);

        return sellerOrderReportModel;
    }

    OrderModel fromAmazonCsvOrderToOrderModel(AmazonCsvOrder amazonCsvOrder) {
        ModelMapper modelMapper = new ModelMapper();
        OrderModel orderModel = modelMapper.map(amazonCsvOrder, OrderModel.class);
        orderModel.setProduct(fromAmazonCsvOrderToProductModel(amazonCsvOrder));
        orderModel.setClient(fromAmazonCsvOrderToClientModel(amazonCsvOrder));
        orderModel.setStatus(OrderStatusType.UPLOADED);
        return orderModel;
    }

    ProductModel fromAmazonCsvOrderToProductModel(AmazonCsvOrder amazonCsvOrder) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper.map(amazonCsvOrder, ProductModel.class);
    }

    ClientModel fromAmazonCsvOrderToClientModel(AmazonCsvOrder amazonCsvOrder) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(amazonCsvOrder, ClientModel.class);
    }
}
