package com.Demo.DesignPartern.SimpleFactory;

public class DienThoaiSamSung extends DienThoai{
    @Override
    public void doChuong() {
        System.out.println("Điện Thoại SamSung đổ chuông ring ring");
    }

    @Override
    public void nhanTin(String denA, String noiDung) {
        System.out.println("Điện Thoại Samsung nhắn tin đến " + denA + "Với nội dung " + noiDung);
    }
    public DienThoaiSamSung(){
        System.out.println("Tạo mới 1 instance đt Samsung");
    }
}
