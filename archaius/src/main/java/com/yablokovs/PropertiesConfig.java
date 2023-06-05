package com.yablokovs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PropertiesConfig {

    @Bean
    @ConfigurationProperties(prefix = "default")
    public ConsulPropertiesImpl defaultProp() {
        return new ConsulPropertiesImpl();
    }

}