package com.celik.foodo.order.service.domain.valueobject;

import com.celik.foodo.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
