package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.productmapping.ProductMappingException;
import pl.com.infratex.ordermanager.dao.entity.ProductMappingEntity;
import pl.com.infratex.ordermanager.dao.repository.ProductMappingRepository;
import pl.com.infratex.ordermanager.service.csv.product.ProductMappingCsvProcessor;
import pl.com.infratex.ordermanager.service.mapper.ProductMappingMapper;
import pl.com.infratex.ordermanager.service.model.ProductMappingCondition;
import pl.com.infratex.ordermanager.web.model.OrderModel;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;
import pl.com.infratex.ordermanager.web.model.ProductModel;
import pl.com.infratex.ordermanager.web.model.SellerOrderReportModel;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ProductMappingService {

    private static final Logger LOGGER = Logger.getLogger(ProductMappingService.class.getName());

    private ProductMappingCsvProcessor productMappingCsvProcessor;
    private ProductMappingRepository productMappingRepository;
    private ProductMappingMapper productMappingMapper;

    public ProductMappingService(ProductMappingCsvProcessor productMappingCsvProcessor,
                                 ProductMappingRepository productMappingRepository,
                                 ProductMappingMapper productMappingMapper) {
        this.productMappingCsvProcessor = productMappingCsvProcessor;
        this.productMappingRepository = productMappingRepository;
        this.productMappingMapper = productMappingMapper;
    }

    public List<ProductMappingModel> parseCsv(InputStream inputStream) throws ProductMappingException {

        List<ProductMappingModel> productMappingModels = productMappingCsvProcessor.parse(new InputStreamReader(inputStream));
        List<ProductMappingEntity> productMappingEntities = productMappingMapper.fromModels(productMappingModels);
        List<ProductMappingEntity> saveProductMappingEntities = productMappingRepository.saveAll(productMappingEntities);

        return productMappingMapper.fromEntities(saveProductMappingEntities);
    }


    public SellerOrderReportModel assignAdditionalProductInfo(SellerOrderReportModel sellerOrderReportModel) {
        List<OrderModel> orders = sellerOrderReportModel.getOrders();
        if (orders != null && orders.size() > 0) {
            for (OrderModel order : orders) {
                ProductModel product = order.getProduct();
                if (product != null) {
                    String sku = product.getSku();
                    ProductMappingEntity productMappingEntity = productMappingRepository.findBySku(sku);
                    if (productMappingEntity != null) {
                        product.setInternalId(productMappingEntity.getInternalProductName());
                        product.setAsin(productMappingEntity.getAsin());
                        product.setCondition(ProductMappingCondition.valueOf("CONDITION_"+productMappingEntity.getCondition()).getConditionType());
                    }
                }

                LOGGER.info("order with internal id: " + order);
                LOGGER.info("product with internal id: " + product);
            }
        }
        return sellerOrderReportModel;
    }

    public ProductMappingModel addOrUpdateProductMapping(ProductMappingModel productMappingModel) {

        ProductMappingEntity productMappingEntity = productMappingMapper.fromModel(productMappingModel);
        ProductMappingEntity existingProductMappingEntity = productMappingRepository.findBySku(productMappingModel.getSku());
        if (existingProductMappingEntity!=null){
           productMappingEntity.setId(existingProductMappingEntity.getId());
        }
        ProductMappingEntity saveProductMappingEntity = productMappingRepository.save(productMappingEntity);

        return productMappingMapper.fromEntity(saveProductMappingEntity);
    }
}
