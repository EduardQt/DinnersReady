package se.hkr.dinnersready.api.rest;

public class ErrorResponse<TContent> {
    private TContent content;

    public TContent getContent() {
        return content;
    }
}
