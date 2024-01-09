package com.celik.foodo.customer.service.domain.ports.output.message.publisher;

import com.celik.foodo.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerMessagePublisher {

    void publish(CustomerCreatedEvent customerCreatedEvent);

}
