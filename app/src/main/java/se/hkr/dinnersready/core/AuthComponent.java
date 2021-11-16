package se.hkr.dinnersready.core;

public class AuthComponent {

    private String userId;
    private String key;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    static {
        instance = new AuthComponent();
    }

    private static AuthComponent instance;

    public static AuthComponent getInstance() {
        return instance;
    }
}
