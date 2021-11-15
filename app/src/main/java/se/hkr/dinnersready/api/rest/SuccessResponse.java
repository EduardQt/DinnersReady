package se.hkr.dinnersready.api.rest;

public class SuccessResponse<TContent> {
    private TContent content;

    public TContent getContent() {
        return content;
    }
}
