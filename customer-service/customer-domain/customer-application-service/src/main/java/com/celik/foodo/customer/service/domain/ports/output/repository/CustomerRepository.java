package com.celik.foodo.customer.service.domain.ports.output.repository;

import com.celik.foodo.customer.service.domain.entity.Customer;

public interface CustomerRepository {

    Customer createCustomer(Customer customer);
}
