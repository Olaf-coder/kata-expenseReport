package com.kata.kataexpensereportback.application.service;


import com.kata.kataexpensereportback.application.port.in.ExpensePortIn;
import com.kata.kataexpensereportback.application.port.out.persistence.ExpensePortOut;
import com.kata.kataexpensereportback.domain.Category;
import com.kata.kataexpensereportback.domain.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService implements ExpensePortIn {

    private final ExpensePortOut expenseRepository;

    @Autowired
    public ExpenseService(ExpensePortOut expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.saveNewExpense(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.getAllExpenses();
    }

    @Override
    public List<Expense> filterExpense(Category category, LocalDate date) {
        if (category == null && date == null) {
            throw new IllegalArgumentException("Category and Date cannot be null");
        }

        if (category == null) {
            return expenseRepository.getExpensesByDate(LocalDate.now());
        }

        if (date == null) {
            return expenseRepository.getExpensesByCategory(category);
        }

        return expenseRepository.getExpensesByCategoryAndDate(category, date);
    }

    @Override
    public BigDecimal getTotalExpensesByCategory(Category category) {
        return expenseRepository.getTotalExpensesByCategory(category);
    }
}
