package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void add_returnsFive_whenAddingTwoAndThree() {
        Calculator calculator = new Calculator();

        double result = calculator.add(2, 3);

        assertEquals(5, result);
    }
}