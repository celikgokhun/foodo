package com.celik.foodo.restaurant.service.domain.ports.output.repository;

import com.celik.foodo.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
