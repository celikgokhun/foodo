package com.celik.foodo.order.service.dataaccess.customer.mapper;

import com.celik.foodo.domain.valueobject.CustomerId;
import com.celik.foodo.order.service.dataaccess.customer.entity.CustomerEntity;
import com.celik.foodo.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }

    public CustomerEntity customerToCustomerEntity(Customer customer) {
        return CustomerEntity.builder()
                .id(customer.getId().getValue())
                .username(customer.getUsername())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .build();
    }
}
