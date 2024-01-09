package com.celik.foodo.customer.service.domain;

import com.celik.foodo.customer.service.domain.entity.Customer;
import com.celik.foodo.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);

}
