package com.Demo.DesignPartern.SimpleFactory;

public class SamsungFactory extends DienThoaiFactory{
    @Override
    public DienThoai getDienThoai() {
        return new DienThoaiSamSung();
    }
}
