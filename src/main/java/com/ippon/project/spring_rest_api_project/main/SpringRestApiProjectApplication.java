package com.ippon.project.spring_rest_api_project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication equivalent to @Configuration, @EnableAutoConfiguration,
 * and @ComponentScan : By default, it will scan all the components in the same package or below.
 */
@SpringBootApplication
public class SpringRestApiProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApiProjectApplication.class, args);
    }

}
