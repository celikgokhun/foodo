package com.celik.foodo.payment.service.domain.ports.output.message.publisher;

import com.celik.foodo.outbox.OutboxStatus;
import com.celik.foodo.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
