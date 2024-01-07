package com.celik.foodo.domain.event.publisher;

import com.celik.foodo.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
