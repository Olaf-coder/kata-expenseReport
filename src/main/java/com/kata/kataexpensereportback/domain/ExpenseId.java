package com.kata.kataexpensereportback.domain;

public record ExpenseId(int value) {
    public ExpenseId {
        if (value < 1) {
            throw new IllegalArgumentException("ExpenseId value must be an integer greater than 0");
        }
    }
}
