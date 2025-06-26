package com.kata.kataexpensereportback.application.port.out.persistence;

import com.kata.kataexpensereportback.domain.Expense;

import java.util.List;

public interface ExpensePortOut {
    List<Expense> getAllExpenses();
    Expense saveNewExpense(Expense expense);

}
