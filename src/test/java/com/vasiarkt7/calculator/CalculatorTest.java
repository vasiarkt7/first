package com.vasiarkt7.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private int leftOperand;

    private int rightOperand;

    private int zeroRightOperand;

    private int expectedSum;

    private Calculator calculator;

    @Before
    public void setUp() {
        leftOperand = 2;
        rightOperand = 2;
        zeroRightOperand = 0;
        expectedSum = 4;

        calculator = new Calculator();
    }

    @Test
    public void shouldCalculateSumCorrectly_whenCalculatePositiveValues() {
        assertEquals(expectedSum, calculator.calculateSum(leftOperand, rightOperand));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException_whenRightOperandIsZero() {
        calculator.calculateDividing(leftOperand, zeroRightOperand);
    }
}