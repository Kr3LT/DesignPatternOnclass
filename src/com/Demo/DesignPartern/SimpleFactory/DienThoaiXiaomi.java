package com.Demo.DesignPartern.SimpleFactory;

public class DienThoaiXiaomi extends DienThoai{
    @Override
    public void doChuong() {
        System.out.println("Dien Thoai Xiaomi Do Chuong");
    }

    @Override
    public void nhanTin(String denA, String noiDung) {
        System.out.println("Dien thoai XiaoMi nhan tin den: " + denA + "Voi noi dubg : " + noiDung);
    }

    public DienThoaiXiaomi() {
    }
}
