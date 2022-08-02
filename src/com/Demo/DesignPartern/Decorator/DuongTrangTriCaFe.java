package com.Demo.DesignPartern.Decorator;

public class DuongTrangTriCaFe extends TrangTriCaFe{
    @Override
    public double getGia() {
        return this.getCafe().getGia() + 500;
    }

    @Override
    public String getMoTa() {
        return this.getCafe().getMoTa() + "Duong";
    }
}
