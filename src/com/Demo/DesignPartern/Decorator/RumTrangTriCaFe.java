package com.Demo.DesignPartern.Decorator;

public class RumTrangTriCaFe extends TrangTriCaFe{
    @Override
    public double getGia() {
        return this.cafe.getGia() + 500;
    }

    @Override
    public String getMoTa() {
        return this.cafe.getMoTa() + "Rum";
    }
    public RumTrangTriCaFe(Cafe x) throws Exception {
        boolean daCoDuongHoacSua = false;
        Cafe x2 = x;
        while(true){
            if(x2 instanceof TrangTriCaFe){
                x2 = (TrangTriCaFe) ((TrangTriCaFe) x2) .getCafe();
                if(x2 instanceof DuongTrangTriCaFe || x2 instanceof SuaTrangTriCaFe) daCoDuongHoacSua = true;

            }else
                break;
        }
        if(daCoDuongHoacSua) throw new Exception("Khong Duoc Trang Tri Them Rum Khi Da Co Duong Hoac Sua");
        this.cafe = x;
    }
}
