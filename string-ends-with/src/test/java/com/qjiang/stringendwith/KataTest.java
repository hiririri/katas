package com.qjiang.stringendwith;

import org.junit.jupiter.api.Test;

import static com.qjiang.stringendwith.Kata.solution;
import static org.assertj.core.api.Assertions.assertThat;

class KataTest {
    @Test
    void shouldReturnTrueWhenStringHasRightSuffix() {
        // Given
        String string = "abc";

        // When
        var result = solution(string, "bc");

        // Then
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseWhenStringHasWrongSuffix() {
        // Given
        String string = "abc";

        // When
        var result = solution(string, "b");

        // Then
        assertThat(result).isFalse();
    }
}