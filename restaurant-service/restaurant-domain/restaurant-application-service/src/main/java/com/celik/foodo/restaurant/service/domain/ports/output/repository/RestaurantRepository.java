package com.celik.foodo.restaurant.service.domain.ports.output.repository;

import com.celik.foodo.restaurant.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
