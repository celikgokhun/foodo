package com.celik.foodo.payment.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditHistoryId extends BaseId<UUID> {
    public CreditHistoryId(UUID value) {
        super(value);
    }
}
