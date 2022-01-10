package se.hkr.dinnersready.api.rest.responses;

public class HouseHoldResponse {
    private String id;
    private String houseHoldName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHouseHoldName() {
        return houseHoldName;
    }

    public void setHouseHoldName(String houseHoldName) {
        this.houseHoldName = houseHoldName;
    }
}
