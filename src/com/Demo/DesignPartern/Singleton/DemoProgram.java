package com.Demo.DesignPartern.Singleton;

public class DemoProgram {
    public static void main(String[] args) {
        Singleton1 x;
        x = Singleton1.getInstance();

    }
    public void doingThing(){
        Singleton1 x;
        x = Singleton1.getInstance();
    }
}
