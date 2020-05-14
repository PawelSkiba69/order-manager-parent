package pl.com.infratex.ordermanager.service.model;

public enum ProductMappingCondition {
    USED_LIKE_NEW (1,"Used; Like New", "Używany; jak nowy"),
    USED_VERY_GOOD (2,"Used; Very Good", "Używany; bardzo dobry"),
    USED_GOOD (3,"Used; Good", "Używany; dobry"),
    USED_ACCEPTABLE (4,"Used; Acceptable", "Używany; akceptowalny"),
    COLLECTIBLE_LIKE_NEW (5,"Collectible; Like New", "Używany; jak nowy"),
    COLLECTIBLE_VERY_GOOD (6,"Collectible; Very Good", "Używany; jak nowy"),
    COLLECTIBLE_GOOD (7,"Collectible; Good", "Używany; jak nowy"),
    COLLECTIBLE_ACCEPTABLE (8,"Collectible; Acceptable", "Używany; jak nowy"),
    NOT_USED(9,"Not used", "Używany; jak nowy"),
    REFURBISHED (10,"Refurbished", "Odświeżony"),
    NEW (11,"New", "Nowy");

    private int key;
    private String value;
    private String label;

    ProductMappingCondition(int key, String value, String label) {
        this.key = key;
        this.value = value;
        this.label = label;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
