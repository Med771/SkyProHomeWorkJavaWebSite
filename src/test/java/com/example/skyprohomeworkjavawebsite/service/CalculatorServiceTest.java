package com.example.skyprohomeworkjavawebsite.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import static com.example.skyprohomeworkjavawebsite.constants.CalculatorServiceTestData.*;

class CalculatorServiceTest {
    private final CalculatorService out = new CalculatorService();

    // PLUS SUCCESS PARAMS FOR TESTS
    public static Stream<Arguments> plusParamsForTestsWithAnswers() {
        return Stream.of(
                Arguments.of(VALID_NUMBER_1, VALID_NUMBER_2, PLUS_ANSWER_1_2),
                Arguments.of(VALID_NUMBER_1, VALID_NUMBER_4, PLUS_ANSWER_1_4),
                Arguments.of(VALID_NUMBER_3, VALID_NUMBER_4, PLUS_ANSWER_3_4)
        );
    }

    // MINUS SUCCESS PARAMS FOR TESTS
    public static Stream<Arguments> minusParamsForTestsWithAnswers() {
        return Stream.of(
                Arguments.of(VALID_NUMBER_2, VALID_NUMBER_1, MINUS_ANSWER_2_1),
                Arguments.of(VALID_NUMBER_3, VALID_NUMBER_4, MINUS_ANSWER_3_4),
                Arguments.of(VALID_NUMBER_4, VALID_NUMBER_1, MINUS_ANSWER_4_1)
        );
    }

    // MULTIPLY SUCCESS PARAMS FOR TESTS
    public static Stream<Arguments> multiplyParamsForTestsWithAnswers() {
        return Stream.of(
                Arguments.of(VALID_NUMBER_1, VALID_NUMBER_2, MULTIPLY_ANSWER_1_2),
                Arguments.of(VALID_NUMBER_1, VALID_NUMBER_4, MULTIPLY_ANSWER_1_4),
                Arguments.of(VALID_NUMBER_3, VALID_NUMBER_4, MULTIPLY_ANSWER_3_4)
        );
    }

    // DIVIDE SUCCESS PARAMS FOR TESTS
    public static Stream<Arguments> divideParamsForTestsWithAnswers() {
        return Stream.of(
                Arguments.of(VALID_NUMBER_4, VALID_NUMBER_2, DIVIDE_ANSWER_4_2),
                Arguments.of(VALID_NUMBER_5, VALID_NUMBER_2, DIVIDE_ANSWER_5_2),
                Arguments.of(VALID_NUMBER_4, VALID_NUMBER_1, DIVIDE_ANSWER_4_1)
        );
    }

    // SUCCESS TESTS
    @ParameterizedTest
    @MethodSource("plusParamsForTestsWithAnswers")
    void shouldGenerateCorrectPlusAnswers(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.plus(a, b));
    }

    @ParameterizedTest
    @MethodSource("minusParamsForTestsWithAnswers")
    void shouldGenerateCorrectMinusAnswers(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("multiplyParamsForTestsWithAnswers")
    void shouldGenerateCorrectMultiplyAnswers(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("divideParamsForTestsWithAnswers")
    void shouldGenerateCorrectDivideAnswers(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.divide(a, b));
    }

    // EXCEPTIONS TESTS
    @Test
    void shouldGenerateNullPointerException() {
        assertThrows(NullPointerException.class, () -> out.plus(null, null));
        assertThrows(NullPointerException.class, () -> out.minus(null, null));
        assertThrows(NullPointerException.class, () -> out.multiply(null, null));
        assertThrows(NullPointerException.class, () -> out.divide(null, null));
    }

    @Test
    void shouldGenerateIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(VALID_NUMBER_1, 0));
    }
}