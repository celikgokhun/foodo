package com.celik.foodo.order.service.domain.ports.output.repository;

import com.celik.foodo.domain.valueobject.OrderId;
import com.celik.foodo.order.service.domain.entity.Order;
import com.celik.foodo.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
