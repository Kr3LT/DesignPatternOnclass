package com.Demo.DesignPartern.Flyweight;

public class DemoApp {
    public static void main(String[] args) {
        CandyBox candyBox = new CandyBox();
        for(int i=0;i<10;i++){
            candyBox.addCandy(10,10,"KeoTao","Xanh","Tao","No");
            candyBox.addCandy(10,10,"KeoOi","Xanh","Oi","No");
            candyBox.addCandy(10,10,"KeoCafe","Den","Cafe","No");
        }
        candyBox.showCandy();
    }
}
