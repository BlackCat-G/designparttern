package com.ghedu.factory.simple;

public class OperationFactory {
    public static Operation getOperation(String operationFlag) {
        Operation operation = null;
        switch (operationFlag) {
            case "add":
                operation = new Add();
                break;
            case "sub":
                operation = new Sub();
                break;
            case "mul":
                operation = new Mul();
            case "div":
                operation = new Div();
        }
        return operation;
    }
}
