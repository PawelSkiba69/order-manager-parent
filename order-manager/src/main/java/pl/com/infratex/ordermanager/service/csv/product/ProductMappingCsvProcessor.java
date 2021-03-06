package pl.com.infratex.ordermanager.service.csv.product;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;
import pl.com.infratex.ordermanager.api.exception.productmapping.ProductMappingCsvProcessorException;
import pl.com.infratex.ordermanager.service.model.ProductMappingCondition;
import pl.com.infratex.ordermanager.service.model.ProductMappingCsvHeader;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@Component
public class ProductMappingCsvProcessor {

    private static final Logger LOGGER = Logger.getLogger(ProductMappingCsvProcessor.class.getName());

    public List<ProductMappingModel> parse(Reader reader) throws ProductMappingCsvProcessorException {
        List<ProductMappingModel> productMappingModels = new ArrayList<>();

        try {
            CSVParser csvRecords = CSVFormat.TDF.withHeader().parse(reader);

            for (CSVRecord csvRecord : csvRecords) {
                String sku = csvRecord.get(ProductMappingCsvHeader.SKU.getName());
                String internalProductName = csvRecord.get(ProductMappingCsvHeader.INTERNAL_PRODUCT_NAME.getName());
                String asin = csvRecord.get(ProductMappingCsvHeader.ASIN.getName());
                String condition = csvRecord.get(ProductMappingCsvHeader.CONDITION.getName());
                LOGGER.info("sku: " + sku);
                LOGGER.info("internalProductName: " + internalProductName);
                LOGGER.info("asin: " + asin);
                LOGGER.info("condition: " + condition);
                int conditionInteger = ProductMappingCondition.NEW.getKey();
                try {
                    conditionInteger = Integer.parseInt(condition);
                    int finalConditionInteger = conditionInteger;
                    ProductMappingCondition productMappingCondition = Arrays.stream(ProductMappingCondition.values())
                            .filter(con -> con.getKey() == finalConditionInteger)
                            .findFirst().orElse(ProductMappingCondition.NEW);

                } catch (NumberFormatException e) {
                    LOGGER.severe("Bład podczas parsowania kolumny condition");
                }
                ProductMappingModel productMappingModel = new ProductMappingModel(sku, internalProductName, asin, conditionInteger);
//                productMappingModel.
                productMappingModels.add(productMappingModel);
            }
        } catch (IOException e) {
            throw new ProductMappingCsvProcessorException("Błąd podczas parsowania pliku csv z mapowaniem produktu", e);
        }
        return productMappingModels;
    }
}
