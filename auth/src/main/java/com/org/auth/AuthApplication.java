package com.org.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(AuthApplication.class);
        springApplication.run(args);
    }

}
