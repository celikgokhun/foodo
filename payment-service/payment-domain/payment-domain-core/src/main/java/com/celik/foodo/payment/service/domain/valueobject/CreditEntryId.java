package com.celik.foodo.payment.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

import java.util.UUID;

public class CreditEntryId extends BaseId<UUID> {
    public CreditEntryId(UUID value) {
        super(value);
    }
}
