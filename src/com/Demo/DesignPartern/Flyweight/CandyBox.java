package com.Demo.DesignPartern.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class CandyBox {
    private List<Candy> candies = new ArrayList<>();
    public void addCandy(double wrapperLength,double wrapperWidth,String name, String color, String flavor, String othersCandyData){
        CandyType candyType = CandyFactory.getCandyType(name,color,flavor,othersCandyData);
        Candy candy = new Candy(wrapperLength,wrapperWidth,candyType);
        candies.add(candy);
    }
    public void showCandy(){
        for(Candy candy : candies){
            System.out.println("Candy Name: " + candy.getCandyType().getName() + " ");
            System.out.println("Candy Color: " + candy.getCandyType().getColor() + " ");
            System.out.println("Candy Flavor: " + candy.getCandyType().getFlavor() + " ");
            System.out.println("Candy wrapperLength: " + candy.getWrapperLength() + " ");
            System.out.println("Candy wrapperWidth: " + candy.getWrapperWidth() + " ");
            System.out.println("Other candy data: " + candy.getCandyType().getOthersCandyData());
        }
    }
}
