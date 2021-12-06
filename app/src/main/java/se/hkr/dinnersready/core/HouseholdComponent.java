package se.hkr.dinnersready.core;

public class HouseholdComponent {

    private String houseHoldId;
    private String houseHoldName;

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    public String getHouseHoldName() {
        return houseHoldName;
    }

    public void setHouseHoldName(String houseHoldName) {
        this.houseHoldName = houseHoldName;
    }

    static {
        instance = new HouseholdComponent();
    }

    private static final HouseholdComponent instance;

    public static HouseholdComponent getInstance() {
        return instance;
    }
}
