package com.Demo.DesignPartern.SimpleFactory;

public class DienThoaiApple extends DienThoai{
    private Long gia;


    @Override
    public void doChuong() {
        System.out.println("Điện thoại Apple Ring");
    }

    @Override
    public void nhanTin(String denA, String noiDung) {
        System.out.println("Điện thoại Apple nhắn tin tới: " + denA + "Nội dung: " + noiDung);
    }
    public DienThoaiApple(){
        gia = 1990L;
        System.out.println("Tạo 1 instance điện thoại Apple");
    }
}
