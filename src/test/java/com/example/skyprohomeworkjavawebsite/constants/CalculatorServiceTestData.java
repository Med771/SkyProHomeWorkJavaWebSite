package com.example.skyprohomeworkjavawebsite.constants;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class CalculatorServiceTestData {
    // VALID NUMBERS
    public static final int VALID_NUMBER_1 = 10;
    public static final int VALID_NUMBER_2 = 20;
    public static final int VALID_NUMBER_3 = 30;
    public static final int VALID_NUMBER_4 = 40;
    public static final int VALID_NUMBER_5 = 0;

    // PLUS SUCCESS ANSWERS
    public static final int PLUS_ANSWER_1_2 = VALID_NUMBER_1 + VALID_NUMBER_2;
    public static final int PLUS_ANSWER_1_4 = VALID_NUMBER_1 + VALID_NUMBER_4;
    public static final int PLUS_ANSWER_3_4 = VALID_NUMBER_3 + VALID_NUMBER_4;

    // MINUS SUCCESS ANSWERS
    public static int MINUS_ANSWER_2_1 = VALID_NUMBER_2 - VALID_NUMBER_1;
    public static int MINUS_ANSWER_3_4 = VALID_NUMBER_3 - VALID_NUMBER_4;
    public static int MINUS_ANSWER_4_1 = VALID_NUMBER_4 - VALID_NUMBER_1;

    // MULTIPLY SUCCESS ANSWERS
    public static int MULTIPLY_ANSWER_1_2 = VALID_NUMBER_1 * VALID_NUMBER_2;
    public static int MULTIPLY_ANSWER_1_4 = VALID_NUMBER_1 * VALID_NUMBER_4;
    public static int MULTIPLY_ANSWER_3_4 = VALID_NUMBER_3 * VALID_NUMBER_4;

    // DIVIDE SUCCESS ANSWERS
    public static int DIVIDE_ANSWER_4_2 = VALID_NUMBER_4 / VALID_NUMBER_2;
    public static int DIVIDE_ANSWER_5_2 = VALID_NUMBER_5 / VALID_NUMBER_2;
    public static int DIVIDE_ANSWER_4_1 = VALID_NUMBER_4 / VALID_NUMBER_1;
}
