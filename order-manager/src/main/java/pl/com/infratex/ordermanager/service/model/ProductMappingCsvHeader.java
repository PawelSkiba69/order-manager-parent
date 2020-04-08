package pl.com.infratex.ordermanager.service.model;

public enum ProductMappingCsvHeader {
    SKU("SKU"), INTERNAL_PRODUCT_NAME("internal-product-name");

    private String name;

    ProductMappingCsvHeader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
