package pl.com.infratex.ordermanager.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import pl.com.infratex.ordermanager.api.exception.admin.AdminException;
import pl.com.infratex.ordermanager.service.AdminService;
import pl.com.infratex.ordermanager.web.model.ProductMappingModel;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger LOGGER = Logger.getLogger(AdminController.class.getName());

    @Autowired
    private AdminService adminService;

    @GetMapping
    public String adminPanelView(ModelMap modelMap) {
        LOGGER.info("adminPanelView() ");
        modelMap.addAttribute("productMappingModel", new ProductMappingModel());
        return "admin/admin-panel";
    }

    @PostMapping("/products/import/mapping")
    public String loadProductsMapping(@RequestParam(name = "products-mapping") MultipartFile file) throws AdminException {
        LOGGER.info("importing: " + file.getOriginalFilename());
        try {
            List<ProductMappingModel> productMappingModels = adminService.loadProductsMapping(file.getInputStream());
        } catch (IOException e) {
            throw new AdminException("Wystąpił błąd podczas ładowania pliku csv", e);
        }
        return "redirect:/admin";
    }

    @PostMapping("/products/add/mapping")
    public String addSingleProductMapping(@ModelAttribute ProductMappingModel productMappingModel) {
        ProductMappingModel savedProductMappingModel = adminService.addOrUpdateProductMapping(productMappingModel);
        return "redirect:/admin";
    }
}
