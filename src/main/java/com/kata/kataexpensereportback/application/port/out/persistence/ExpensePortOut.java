package com.kata.kataexpensereportback.application.port.out.persistence;

import com.kata.kataexpensereportback.domain.Category;
import com.kata.kataexpensereportback.domain.Expense;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface ExpensePortOut {
    List<Expense> getAllExpenses();
    Expense saveNewExpense(Expense expense);
    List<Expense> getExpensesByCategory(Category category);
    List<Expense> getExpensesByDate(LocalDate date);
    List<Expense> getExpensesByCategoryAndDate(Category category, LocalDate date);
    BigDecimal getTotalExpensesByCategory(Category category);

}
