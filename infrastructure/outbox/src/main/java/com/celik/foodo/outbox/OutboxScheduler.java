package com.celik.foodo.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
