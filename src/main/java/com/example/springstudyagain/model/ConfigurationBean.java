package com.example.springstudyagain.model;

import com.example.springstudyagain.repository.ConfigurationAnnotationEntityTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
    @Bean
    public ConfigurationAnnotationEntityTest configurationAnnotationTest() {
        return new ConfigurationAnnotationEntityTest();
    }
}
