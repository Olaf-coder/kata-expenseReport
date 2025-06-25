package com.kata.kataexpensereportback.domain;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ExpenseTest {

    @ParameterizedTest()
    @MethodSource("invalidExpenseConstructors")
    void SHOULD_throw_NullPointerException_WHEN_CreateExpense_with_incorrect_values(Supplier<Expense> expenseConstructor) {
        //GIVEN

        //WHEN //THEN
        assertThatNullPointerException().isThrownBy(expenseConstructor::get);
    }

    @Test
    void SHOULD_create_new_expense_WHEN_CreateExpense_with_correct_values() {
        //GIVEN
        ExpenseId expectedId = new ExpenseId(1);
        ExpenseAmount expectedAmount = new ExpenseAmount(BigDecimal.valueOf(10.10));
        Category expectedCategory = Category.TRANSPORTATION;
        LocalDate expectedDate = LocalDate.now();
        String expectedDescription = "description";

        //WHEN
        Expense actualExpense = new Expense(expectedId, expectedAmount, expectedCategory, expectedDate, expectedDescription);

        //THEN
        SoftAssertions softAssert = new SoftAssertions();
        softAssert.assertThat(actualExpense.getId()).isEqualTo(expectedId);
        softAssert.assertThat(actualExpense.getAmount()).isEqualTo(expectedAmount);
        softAssert.assertThat(actualExpense.getCategory()).isEqualTo(expectedCategory);
        softAssert.assertThat(actualExpense.getDate()).isEqualTo(expectedDate);
        softAssert.assertThat(actualExpense.getDescription()).isEqualTo(expectedDescription);
        softAssert.assertAll();
    }

    private static Stream<Supplier<Expense>> invalidExpenseConstructors() {
        return Stream.of(
                ()-> new Expense(null, new ExpenseAmount(BigDecimal.valueOf(10.10)), Category.TRANSPORTATION, LocalDate.now()),
                ()-> new Expense(new ExpenseId(1), null, Category.TRANSPORTATION, LocalDate.now()),
                () -> new Expense(new ExpenseId(1), new ExpenseAmount(BigDecimal.valueOf(10.10)),null, LocalDate.now()),
                () -> new Expense(new ExpenseId(1), new ExpenseAmount(BigDecimal.valueOf(10.10)), Category.TRANSPORTATION, null)
        );
    }

}
