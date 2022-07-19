package com.Demo.SOLID.OCP;

import java.security.InvalidParameterException;

public class Calculator {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Addition operation;
        operation = new Addition(2,3);
        c.calculate(operation);
        System.out.println(operation.getResult());
    }

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
//        if (operation == null) {
//            throw new InvalidParameterException("Cannot perform operation");
//        }
//        operation.perform();
//      }
    }
}
