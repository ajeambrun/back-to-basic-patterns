package com.octo.strategy;

import java.util.List;

class OperationBuilder {
    static List<Operation> operations = List.of(new Addition(), new Soustraction());

    static Operation of(String operator) {
        return operations.stream().filter(operation -> operation.accept(operator)).findFirst().orElse(null);
    }
}

public interface Operation {
    int compute(int leftOperand, int rightOperand);
    boolean accept(String symbol);

    static Operation of(String symbol) {
        return OperationBuilder.of(symbol);
    }
}

class Addition implements Operation {

    @Override
    public int compute(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    @Override
    public boolean accept(String symbol) {
        return "+".equals(symbol);
    }
}

class Soustraction implements Operation {
    @Override
    public int compute(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    @Override
    public boolean accept(String symbol) {
        return "-".equals(symbol);
    }
}