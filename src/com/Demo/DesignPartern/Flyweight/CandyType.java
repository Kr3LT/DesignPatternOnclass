package com.Demo.DesignPartern.Flyweight;

public class CandyType {
    private String name;
    private String color;
    private String flavor;
    private String othersCandyData;

    public CandyType(String name, String color, String flavor, String othersCandyData) {
        this.name = name;
        this.color = color;
        this.flavor = flavor;
        this.othersCandyData = othersCandyData;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getOthersCandyData() {
        return othersCandyData;
    }
}
