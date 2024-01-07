package com.celik.foodo.order.service.domain.ports.input.message.listener.restaurantapproval;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
