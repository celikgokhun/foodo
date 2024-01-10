package com.celik.foodo.restaurant.service.domain.ports.input.message.listener;

import com.celik.foodo.restaurant.service.domain.dto.RestaurantApprovalRequest;

public interface RestaurantApprovalRequestMessageListener {
    void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest);
}
