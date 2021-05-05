package com.octo.strategy;

public interface Operation {
    int compute(int leftOperand, int rightOperand);

    static Operation of(String operator) {
        if (operator.equals("+")) {
            return new Addition();
        } else {
            return new Soustraction();
        }
    }
}

class Addition implements Operation {
    @Override
    public int compute(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }
}

class Soustraction implements Operation {
    @Override
    public int compute(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }
}