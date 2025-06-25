package com.kata.kataexpensereportback.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Expense {

    private final ExpenseId id;
    private Category category;
    private LocalDate date;
    private String description;

    public Expense(ExpenseId id, Category category, LocalDate date, String description) {
        this.id = id;
        this.category = category;
        this.date = date;
        this.description = description;
        Objects.requireNonNull(id, "id cannot be null");
        Objects.requireNonNull(category, "category cannot be null");
        Objects.requireNonNull(date, "date cannot be null");
    }

    public ExpenseId getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
