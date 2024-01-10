package com.celik.foodo.payment.service.domain.ports.output.repository;

import com.celik.foodo.domain.valueobject.CustomerId;
import com.celik.foodo.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
