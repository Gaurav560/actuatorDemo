package com.unlogged.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "customEndpoint")
@Component
public class CustomEndPoint {

    private final Map<String, String> dataStore = new HashMap<>();

    @ReadOperation
    public Map<String, String> customInfo() {
        // Return current data in the store
        Map<String, String> response = new HashMap<>();
        response.put("status", "Custom endpoint is up and running");
        response.putAll(dataStore);
        return response;
    }

    @WriteOperation
    public String updateInfo(String key, String value) {
        // Update data in the store
        dataStore.put(key, value);
        return "Updated key '" + key + "' with value '" + value + "'";
    }

    @DeleteOperation
    public String deleteInfo(String key) {
        // Remove data from the store
        if (dataStore.containsKey(key)) {
            dataStore.remove(key);
            return "Deleted key: " + key;
        }
        return "No entry found for key: " + key;
    }
}
