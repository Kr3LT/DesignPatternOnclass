package com.Demo.DesignPartern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CandyFactory {
    static Map<String, CandyType> candyTypes = new HashMap<>();

    public static CandyType getCandyType(String name,String color,String flavor,String othersCandyData){
        CandyType result = candyTypes.get(name);
        if(result != null){
            System.out.println("CandyType Got from Candy Factory");
            return result;
        }
        result = new CandyType(name, color, flavor, othersCandyData);
        candyTypes.put(name,result);
        System.out.println("Add new CandyType To Factory");
        return result;
        }
}
