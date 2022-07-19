package com.Demo.DesignPartern.Prototype;

public class Program {
    public static void main(String[] args) {
        SinhVien A = new SinhVien("Adu","Dua");
        SinhVien x = (SinhVien)A.saoChep();
        System.out.println("Ten x: " + x.getHoTen() + "Dia Chi x :" + x.getDiaChi());
        System.out.println("A va x la 2 Bien khac nhau " + (x != A) );
    }
}
