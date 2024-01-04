package com.celik.foodo.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.celik.foodo.domain.event.publisher.DomainEventPublisher;
import com.celik.foodo.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
