package com.celik.foodo.order.service.domain.ports.output.message.publisher.payment;

import com.celik.foodo.domain.event.publisher.DomainEventPublisher;
import com.celik.foodo.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
