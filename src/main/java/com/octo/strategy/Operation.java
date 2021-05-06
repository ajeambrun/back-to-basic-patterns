package com.octo.strategy;


import java.util.Arrays;
import java.util.function.BinaryOperator;

public enum Operation {
    ADD("+", (a, b) -> a + b),
    SUB("-", (a, b) -> a - b);

    String symbol;
    BinaryOperator<Integer> operator;

    Operation(String symbol, BinaryOperator<Integer> operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    int compute(int leftOperand, int rightOperand) {
        return operator.apply(leftOperand, rightOperand);
    }

    static Operation of(String symbol) {
        return Arrays.stream(values()).filter(v -> v.symbol.equals(symbol)).findFirst().orElse(null);
    }
}
