package com.celik.foodo.payment.service.domain;

import com.celik.foodo.payment.service.domain.entity.CreditEntry;
import com.celik.foodo.payment.service.domain.entity.CreditHistory;
import com.celik.foodo.payment.service.domain.entity.Payment;
import com.celik.foodo.payment.service.domain.event.PaymentEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages);
}
