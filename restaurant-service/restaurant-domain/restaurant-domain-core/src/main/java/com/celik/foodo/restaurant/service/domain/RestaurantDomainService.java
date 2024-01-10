package com.celik.foodo.restaurant.service.domain;

import com.celik.foodo.restaurant.service.domain.entity.Restaurant;
import com.celik.foodo.restaurant.service.domain.event.OrderApprovalEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant, List<String> failureMessages);
}