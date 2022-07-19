package com.Demo.DesignPartern.SimpleFactory;

public class AppleFactory extends DienThoaiFactory{
    @Override
    public DienThoai getDienThoai() {
        return new DienThoaiApple();
    }
}
