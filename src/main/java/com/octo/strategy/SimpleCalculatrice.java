package com.octo.strategy;

public class SimpleCalculatrice {

    public int calculate(int leftOperand, int rightOperand, String operator) {
        if ("+".equals(operator)) {
            return leftOperand + rightOperand;
        } else if ("-".equals(operator)) {
            return leftOperand - rightOperand;
        }

        return 0;
    }
}
