package se.hkr.dinnersready.api.rest.responses;

public class HouseholdFileResponse {

    private String householdId;
    private String fileName;
    private String fileContent;

    public String getHouseholdId() {
        return householdId;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileContent() {
        return fileContent;
    }
}
