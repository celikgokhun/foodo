package com.celik.foodo.restaurant.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.celik.foodo.restaurant.service.dataaccess", "com.celik.foodo.dataaccess" })
@EntityScan(basePackages = { "com.celik.foodo.restaurant.service.dataaccess", "com.celik.foodo.dataaccess" })
@SpringBootApplication(scanBasePackages = "com.celik.foodo")
public class RestaurantServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
