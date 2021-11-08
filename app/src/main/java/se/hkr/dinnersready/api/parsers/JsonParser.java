package se.hkr.dinnersready.api.parsers;

import com.google.gson.Gson;

public class JsonParser {
    private final Gson gson;

    JsonParser() {
        this.gson = new Gson();
    }

    public <T> T parse(String json, Class<T> clazz) {
        System.out.println(json);
        return this.gson.fromJson(json, clazz);
    }

    private static JsonParser instance;

    static {
        instance = new JsonParser();
    }

    public static JsonParser getInstance() {
        return instance;
    }
}
