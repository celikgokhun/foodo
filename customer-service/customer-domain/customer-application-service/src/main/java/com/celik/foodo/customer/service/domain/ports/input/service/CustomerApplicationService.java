package com.celik.foodo.customer.service.domain.ports.input.service;

import com.celik.foodo.customer.service.domain.create.CreateCustomerCommand;
import com.celik.foodo.customer.service.domain.create.CreateCustomerResponse;

import jakarta.validation.Valid;

public interface CustomerApplicationService {

    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);

}
