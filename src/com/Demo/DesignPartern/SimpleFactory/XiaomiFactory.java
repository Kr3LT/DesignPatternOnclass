package com.Demo.DesignPartern.SimpleFactory;

public class XiaomiFactory extends DienThoaiFactory{
    @Override
    public DienThoai getDienThoai() {
        return new DienThoaiXiaomi();
    }
}
