package com.celik.foodo.order.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
