package com.kata.kataexpensereportback.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Expense {

    private final ExpenseId id;
    private ExpenseAmount amount;
    private Category category;
    private LocalDate date;
    private String description;

    public Expense(ExpenseId id, ExpenseAmount amount, Category category, LocalDate date) {
        this(id, amount, category, date, "");

    }

    public Expense(ExpenseId id, ExpenseAmount amount, Category category, LocalDate date, String description) {
        this.id = id;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
        Objects.requireNonNull(id, "id cannot be null");
        Objects.requireNonNull(amount, "amount cannot be null");
        Objects.requireNonNull(category, "category cannot be null");
        Objects.requireNonNull(date, "date cannot be null");
    }

    public ExpenseId getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public ExpenseAmount getAmount() {
        return amount;
    }

}
