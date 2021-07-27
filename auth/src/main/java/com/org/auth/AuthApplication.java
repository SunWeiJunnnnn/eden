package com.org.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AuthApplication {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication sa =
                new SpringApplicationBuilder().sources(AuthApplication.class).web(WebApplicationType.SERVLET).build();
        applicationContext = sa.run(args);
//        SpringApplication springApplication = new SpringApplication(AuthApplication.class);
//        springApplication.run(args);
    }

}
