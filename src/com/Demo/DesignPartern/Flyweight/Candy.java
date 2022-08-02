package com.Demo.DesignPartern.Flyweight;

public class Candy {
    private double wrapperLength;
    private double wrapperWidth;
    private CandyType candyType;

    public CandyType getCandyType() {
        return candyType;
    }
    public Candy(double wrapperLength, double wrapperWidth, CandyType candyType) {
        this.wrapperLength = wrapperLength;
        this.wrapperWidth = wrapperWidth;
        this.candyType = candyType;
    }
    public double getWrapperLength() {
        return wrapperLength;
    }
    public double getWrapperWidth() {
        return wrapperWidth;
    }

}
