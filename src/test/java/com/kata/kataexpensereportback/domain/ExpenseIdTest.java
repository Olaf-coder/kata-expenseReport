package com.kata.kataexpensereportback.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class ExpenseIdTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void SHOULD_throw_Exception_WHEN_value_is_less_than_one(int value) {
        //GIVEN

        //WHEN //THEN
        assertThatIllegalArgumentException().isThrownBy(() -> new ExpenseId(value));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 1000})
    void SHOULD_create_an_expense_id_WHEN_value_is_greater_than_one(int value) {
        //GIVEN

        //WHEN
        ExpenseId expenseId = new ExpenseId(value);

        //THEN
        assertThat(expenseId.value()).isEqualTo(value);
    }
}
