package com.example.springstudyagain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})一般不用这个注解来引入外部的配置文件，一般用@Configuration+@Bean方式，详情可以看MyAppconfig这个类
@SpringBootApplication
public class SpringStudyAgainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudyAgainApplication.class, args);
    }

}
