package com.Demo.SOLID.OCP;

public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Division() {
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    // constructor, getters and setters
//    @Override
//    public void perform() {
//        if (right != 0) {
//            result = left / right;
//        }
//    }
}
