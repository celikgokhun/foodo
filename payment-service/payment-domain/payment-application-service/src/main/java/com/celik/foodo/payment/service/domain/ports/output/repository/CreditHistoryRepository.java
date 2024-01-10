package com.celik.foodo.payment.service.domain.ports.output.repository;

import com.celik.foodo.domain.valueobject.CustomerId;
import com.celik.foodo.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
