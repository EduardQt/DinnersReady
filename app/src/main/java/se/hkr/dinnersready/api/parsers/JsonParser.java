package se.hkr.dinnersready.api.parsers;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonParser {
    private final Gson gson;

    JsonParser() {
        this.gson = new Gson();
    }

    public <T> T parse(String json, Class<T> clazz) {
        return this.gson.fromJson(json, clazz);
    }

    public <T> T parse(String json, Type clazz) {
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
