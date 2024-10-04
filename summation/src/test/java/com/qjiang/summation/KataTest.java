package com.qjiang.summation;

import org.junit.jupiter.api.Test;

import static com.qjiang.summation.Kata.sum;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class KataTest {
    @Test
    void shouldSumNumber2() {
        // Given
        int number = 2;

        // When
        var result = sum(number);

        // Then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldSumNumber8() {
        // Given
        int number = 8;

        // When
        var result = sum(number);

        // Then
        assertThat(result).isEqualTo(36);
    }

    @Test
    void shouldReturn1WhenNumberIs1() {
        // Given
        int number = 1;

        // When
        var result = sum(number);

        // Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative() {
        // Given
        int number = -1;

        // Then
        assertThatThrownBy(() -> sum(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Number must be greater than or equal to 0");
    }
}