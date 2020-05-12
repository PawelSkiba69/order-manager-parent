package pl.com.infratex.ordermanager.service.model;

public enum ProductMappingCondition {
    USED_LIKE_NEW (1,"Used; Like New"),
    USED_VERY_GOOD (2,"Used; Very Good"),
    USED_GOOD (3,"Used; Good"),
    USED_ACCEPTABLE (4,"Used; Acceptable"),
    COLLECTIBLE_LIKE_NEW (5,"Collectible; Like New"),
    COLLECTIBLE_VERY_GOOD (6,"Collectible; Very Good"),
    COLLECTIBLE_GOOD (7,"Collectible; Good"),
    COLLECTIBLE_ACCEPTABLE (8,"Collectible; Acceptable"),
    NOT_USED(9,"Not used"),
    REFURBISHED (10,"Refurbished"),
    NEW (11,"New"),
    CONDITION_11 (11,"New");

    private int conditionId;
    private String conditionType;

    ProductMappingCondition(int conditionId, String conditionType) {
        this.conditionId = conditionId;
        this.conditionType = conditionType;
    }

    public int getConditionId() {
        return conditionId;
    }

    public void setConditionId(int conditionId) {
        this.conditionId = conditionId;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }
}
