package pl.com.infratex.ordermanager.service;

import org.springframework.stereotype.Service;
import pl.com.infratex.ordermanager.api.exception.admin.AdminException;
import pl.com.infratex.ordermanager.api.exception.admin.AdminProductMappingException;
import pl.com.infratex.ordermanager.api.exception.productmapping.ProductMappingException;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;

import java.io.InputStream;
import java.util.List;

@Service
public class AdminService {
//FixMe wydzielić do nowego serwisu

    private ProductMappingService productMappingService;

    public AdminService(ProductMappingService productMappingService) {
        this.productMappingService = productMappingService;
    }

    public List<ProductMappingModel> loadProductsMapping(InputStream inputStream) throws AdminException {
        try {
            return productMappingService.parseCsv(inputStream);
        } catch (ProductMappingException e) {
            throw new AdminProductMappingException("Błąd podczas ładowania mapowań produktu", e);
        }
    }
}
