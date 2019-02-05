package com.vasiarkt7.calculator;

class Calculator {
    int calculateSum(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    int calculateSubstraction(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    int calculateDividing(int leftOperand, int rightOperand) {
        if (rightOperand == 0) {
            throw new IllegalArgumentException("Right operand should not be zero when dividing");
        }
        return leftOperand / rightOperand;
    }

    int calculateMultiplieng(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }
}
