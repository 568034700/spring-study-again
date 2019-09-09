package com.example.springstudyagain.web;

import com.example.springstudyagain.repository.ConfigurationAnnotationEntityTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @RequestMapping("/")
    public String home() {
        return "hello world";
    }

    @Value("${person.last-name}")
    String name;

    @RequestMapping("/a")
    public String hello() {
        return "hello" + name;
    }


}
