package com.celik.foodo.restaurant.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderApprovalId extends BaseId<UUID> {
    public OrderApprovalId(UUID value) {
        super(value);
    }
}
