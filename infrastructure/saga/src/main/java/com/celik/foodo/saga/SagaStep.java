package com.celik.foodo.saga;

public interface SagaStep<T> {
    void process(T data);
    void rollback(T data);
}
