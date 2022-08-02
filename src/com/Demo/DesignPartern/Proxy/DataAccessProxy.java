package com.Demo.DesignPartern.Proxy;

import java.util.HashMap;

public class DataAccessProxy implements DataAccessInterface{
    private final DataAccessService dataAccessService;
    private HashMap<String, SinhVien>  cacheAllSinhVien = new HashMap<>();

    public DataAccessProxy() {
        this.dataAccessService = new DataAccessService();
    }

    @Override
    public HashMap<String, SinhVien> getAllSinhVien() {
        if(cacheAllSinhVien.isEmpty()){
            cacheAllSinhVien = dataAccessService.getAllSinhVien();
        }else {
            System.out.println("List Retrieve From Cache");
        }
        return cacheAllSinhVien;
    }

    @Override
    public SinhVien getSinhVien(String id) {
        SinhVien sinhVien = cacheAllSinhVien.get(id);
        if(sinhVien == null){
            sinhVien = dataAccessService.getSinhVien(id);
            cacheAllSinhVien.put(id,sinhVien);
        }else {
            System.out.println("SinhVien with id :" + sinhVien.getId() + " Retrieve From Cache");
        }
        return sinhVien;
    }
    public void resetCache(){
        cacheAllSinhVien.clear();
    }
}
