package com.octo.strategy;

class Calculatrice {
    public int compute(int leftOperand, int rightOperand, String operator) {
        return Operation.of(operator).compute(leftOperand, rightOperand);
    }
}
