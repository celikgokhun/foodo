package com.celik.foodo.customer.service;

import com.celik.foodo.customer.service.domain.CustomerDomainService;
import com.celik.foodo.customer.service.domain.CustomerDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CustomerDomainService customerDomainService() {
        return new CustomerDomainServiceImpl();
    }
}
