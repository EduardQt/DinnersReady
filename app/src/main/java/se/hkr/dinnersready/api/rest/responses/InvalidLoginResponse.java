package se.hkr.dinnersready.api.rest.responses;

public class InvalidLoginResponse {
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
