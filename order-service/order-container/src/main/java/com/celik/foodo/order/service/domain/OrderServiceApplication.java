package com.celik.foodo.order.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.celik.foodo.order.service.dataaccess", "com.celik.foodo.dataaccess" })
@EntityScan(basePackages = { "com.celik.foodo.order.service.dataaccess", "com.food.ordering.system.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.celik.foodo")
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
