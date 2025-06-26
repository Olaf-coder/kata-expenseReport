package com.kata.kataexpensereportback.application.port.in;

import com.kata.kataexpensereportback.domain.Category;
import com.kata.kataexpensereportback.domain.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ExpensePortIn {
    Expense addExpense(Expense expense);
    List<Expense> getAllExpenses();
    List<Expense> filterExpense(Category category, LocalDate date);
    BigDecimal getTotalExpensesByCategiry(Category category);
}
