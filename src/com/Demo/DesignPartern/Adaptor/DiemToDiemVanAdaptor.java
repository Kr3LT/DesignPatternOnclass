package com.Demo.DesignPartern.Adaptor;

public class DiemToDiemVanAdaptor implements IDiemRepo{
    private String maMonHoc;
    IDiemVanRepo diemVanRepo;

    public void setDiemVanRepo(IDiemVanRepo diemVanRepo) {
        this.diemVanRepo = diemVanRepo;
    }

    public DiemToDiemVanAdaptor(IDiemVanRepo diemVanRepo) {
        this.diemVanRepo = diemVanRepo;
    }

    @Override
    public double getDiem(String maSinhVien) {
        if(maMonHoc == "VAN") return diemVanRepo.getDiemVan(maSinhVien);
        return 0;
    }
}
