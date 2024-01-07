package com.celik.foodo.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.celik.foodo.order.service.domain.outbox.model.approval.OrderApprovalOutboxMessage;
import com.celik.foodo.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface RestaurantApprovalRequestMessagePublisher {

    void publish(OrderApprovalOutboxMessage orderApprovalOutboxMessage,
                 BiConsumer<OrderApprovalOutboxMessage, OutboxStatus> outboxCallback);
}
