package com.celik.foodo.order.service.domain.ports.output.message.publisher.payment;

import com.celik.foodo.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
import com.celik.foodo.outbox.OutboxStatus;


import java.util.function.BiConsumer;

public interface PaymentRequestMessagePublisher {

    void publish(OrderPaymentOutboxMessage orderPaymentOutboxMessage,
                 BiConsumer<OrderPaymentOutboxMessage, OutboxStatus> outboxCallback);
}
