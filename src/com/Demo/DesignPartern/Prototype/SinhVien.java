package com.Demo.DesignPartern.Prototype;

public class SinhVien implements Prototype{
    private String hoTen;
    private String diaChi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public SinhVien(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    @Override
    public Prototype saoChep() {
        SinhVien x = new SinhVien(hoTen,diaChi);
        //
        //  Thực hiện các thứ khác
        //
        return x;
    }
}
