package com.kata.kataexpensereportback.domain;

import java.math.BigDecimal;
import java.util.Objects;

public record ExpenseAmount(BigDecimal amount) {
    public ExpenseAmount {
        Objects.requireNonNull(amount, "amount cannot be null");
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }
        if (amount.scale() > 2) {
            throw new IllegalArgumentException("amount scale must be less than or equal to 2");
        }
    }
}
