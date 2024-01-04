package com.celik.foodo.order.service.domain.ports.output.message.publisher.payment;

import com.celik.foodo.domain.event.publisher.DomainEventPublisher;
import com.celik.foodo.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {

}
