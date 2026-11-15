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

    @Test
    void subtract_returnsFive_whenSubtractTenAndFive(){
        Calculator calculator = new Calculator();

        double result = calculator.subtract(10, 5);

        assertEquals(5, result);
    }

    @Test
    void divide_returnsFive_whendivedeTenAndTwo(){
        Calculator calculator = new Calculator();

        double result = calculator.divide(10, 2);

        assertEquals(5, result);
    }

    @Test
    void multiply_returnsTen_whenMultTwoAndFive(){
        Calculator calculator = new Calculator();

        double result = calculator.multiply(2, 5);

        assertEquals(10, result);
    }

    @Test
    void add_returns03_whenAdding02And01() {
        Calculator calculator = new Calculator();

        double result = calculator.add(0.2, 0.1);

        assertEquals(0.3, result, 0.0001);
    }
}