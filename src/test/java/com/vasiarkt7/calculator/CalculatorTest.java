package com.vasiarkt7.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private int leftOperand;

    private int rightOperand;
       private int zeroRightOperand;

    private int expectedSum;

    private int expectedResultOfMultiplieng;

    private int expectedResultOfSubstraction;

    private Calculator calculator;

    @Before
    public void setUp() {
        leftOperand = 3;
        rightOperand = 2;
        zeroRightOperand = 0;
        expectedSum = 5;
        expectedResultOfMultiplieng = 6;
        expectedResultOfSubstraction = 1;

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

    @Test
    public void shouldCalculateSubstructionCorrectly_whenCalculatePositiveValues() {
        assertEquals( expectedResultOfSubstraction, calculator.calculateSubstraction(leftOperand, rightOperand));
    }

    @Test
    public void shouldCalculateMultipliengCorrectly_whenCalculatePositiveValues() {
        assertEquals(expectedResultOfMultiplieng, calculator.calculateMultiplieng(leftOperand, rightOperand));
    }
}