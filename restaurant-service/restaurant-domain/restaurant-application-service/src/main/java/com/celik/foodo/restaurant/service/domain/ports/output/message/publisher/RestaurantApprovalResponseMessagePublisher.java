package com.celik.foodo.restaurant.service.domain.ports.output.message.publisher;

import com.celik.foodo.outbox.OutboxStatus;
import com.celik.foodo.restaurant.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface RestaurantApprovalResponseMessagePublisher {

    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
