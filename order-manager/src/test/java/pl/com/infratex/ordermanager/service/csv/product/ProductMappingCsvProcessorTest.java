package pl.com.infratex.ordermanager.service.csv.product;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import pl.com.infratex.ordermanager.api.exception.productmapping.ProductMappingCsvProcessorException;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductMappingCsvProcessorTest {

    @Test
    void parse() throws IOException, ProductMappingCsvProcessorException {
        ClassPathResource classPathResource = new ClassPathResource("csv/products-mapping-test.csv");
        ProductMappingCsvProcessor processor = new ProductMappingCsvProcessor();
        List<ProductMappingModel> productMappingModels = processor.parse(new InputStreamReader(classPathResource.getInputStream()));

        assertEquals(4, productMappingModels.size(), "number of imported product mappings didn't match");
    }
}