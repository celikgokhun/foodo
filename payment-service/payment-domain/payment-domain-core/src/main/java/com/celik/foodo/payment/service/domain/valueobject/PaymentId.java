package com.celik.foodo.payment.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

import java.util.UUID;

public class PaymentId extends BaseId<UUID> {
    public PaymentId(UUID value) {
        super(value);
    }
}
