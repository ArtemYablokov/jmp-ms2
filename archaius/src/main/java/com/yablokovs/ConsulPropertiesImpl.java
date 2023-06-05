package com.yablokovs;

import java.util.HashMap;
import java.util.Map;

public class ConsulPropertiesImpl {

    private Map<String, String> dataProperties = new HashMap<>();

    public Map<String, String> getDataProperties() {
        return dataProperties;
    }

    public String getDataByKey(String key) {
        if (dataProperties.containsKey(key))
            return dataProperties.get(key);
        return "";
    }
}
