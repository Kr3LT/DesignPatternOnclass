package com.Demo.DesignPartern.Proxy;

import java.util.HashMap;

public class DataAccessService implements DataAccessInterface{
    @Override
    public HashMap<String, SinhVien> getAllSinhVien() {
        accessingData("SinhVienData");
        return createListSv();
    }
    @Override
    public SinhVien getSinhVien(String id) {
        accessingData("SinhVienData");
        return createSinhVien(id);
    }
    private void accessingData(String dataName){
        System.out.println("Accessing " + dataName);
        fakeDataAccessDelay();
        System.out.println("Accessed");
    }
    private HashMap<String, SinhVien> createListSv(){
        HashMap<String, SinhVien> list = new HashMap<>();
        list.put("sinhVien1",new SinhVien("sinhVien1","Hieu"));
        list.put("sinhVien2",new SinhVien("sinhVien2","Minh"));
        list.put("sinhVien3",new SinhVien("sinhVien3","Kien"));
        list.put("sinhVien4",new SinhVien("sinhVien4","Linh"));
        return list;
    }
    private SinhVien createSinhVien(String id){
        SinhVien sinhVien = new SinhVien(id,createListSv().get(id).getName());
        return sinhVien;
    }
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    private void fakeDataAccessDelay() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
