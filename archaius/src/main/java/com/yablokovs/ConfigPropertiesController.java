package com.yablokovs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigPropertiesController {

    @Autowired
    ConsulPropertiesImpl consulProperties;

    @GetMapping("/property")
    public String getPropertyValue() {
        String property = consulProperties.getDataByKey("property");

        return "VALUE OF PROPERTY = " + property;
    }
}