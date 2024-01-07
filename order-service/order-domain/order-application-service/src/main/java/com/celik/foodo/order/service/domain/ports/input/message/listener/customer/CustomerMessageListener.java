package com.celik.foodo.order.service.domain.ports.input.message.listener.customer;

import com.celik.foodo.order.service.domain.dto.message.CustomerModel;

public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}
