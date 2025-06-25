package com.kata.kataexpensereportback.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.*;

class ExpenseAmountTest {

    @ParameterizedTest
    @ValueSource( doubles= {-1, 0, 1.12345})
    void SHOULD_throw_Exception_WHEN_value_is_less_or_equal_tozero(double value) {
        //GIVEN

        //WHEN //THEN
        assertThatIllegalArgumentException().isThrownBy(() -> new ExpenseAmount(BigDecimal.valueOf(value)));
    }

    @ParameterizedTest
    @ValueSource(doubles = {1, 1000, 0.12})
    void SHOULD_create_an_expense_id_WHEN_value_is_correct(double value) {
        //GIVEN

        //WHEN
        ExpenseAmount expenseAmount = new ExpenseAmount(BigDecimal.valueOf(value));

        //THEN
        assertThat(expenseAmount.amount().doubleValue()).isEqualTo(value);
    }
}
