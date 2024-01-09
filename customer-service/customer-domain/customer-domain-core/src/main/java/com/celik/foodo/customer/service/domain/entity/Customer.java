package com.celik.foodo.customer.service.domain.entity;

import com.celik.foodo.domain.entity.AggregateRoot;
import com.celik.foodo.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    private final String username;
    private final String firstName;
    private final String lastName;

    public Customer(CustomerId customerId, String username, String firstName, String lastName) {
        super.setId(customerId);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
