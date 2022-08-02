package com.Demo.DesignPartern.Proxy;

import java.util.HashMap;

public class DemoApp {
    private DataAccessInterface dataAccessInterface;

    public DemoApp(DataAccessInterface dataAccessInterface) {
        this.dataAccessInterface = dataAccessInterface;
    }
    public void showAllSinhVien(){
        HashMap<String, SinhVien> listSv = dataAccessInterface.getAllSinhVien();
        System.out.println("Getting List Sinh Vien");
        for(SinhVien sv : listSv.values()){
            System.out.println("SinhVien id: " + sv.getId() + " SinhVien name: " + sv.getName());
        }
    }
    public void showOneSinhVien(String id){
        SinhVien sv = dataAccessInterface.getSinhVien(id);
        System.out.println("Get One Sinh Vien");
        System.out.println("SinhVien id: " + sv.getId() + " SinhVien name: " + sv.getName());

    }
    public static Long testRun(DemoApp demoApp){
        long startTime = System.currentTimeMillis();
        demoApp.showAllSinhVien();
        demoApp.showOneSinhVien("sinhVien1");
        demoApp.showOneSinhVien("sinhVien2");
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
    public static void main(String[] args) {
        DemoApp proxyDemoApp = new DemoApp(new DataAccessProxy());
        DemoApp nonProxyDemoApp = new DemoApp(new DataAccessService());

        long proxyAppTime = testRun(proxyDemoApp);
        long nonProxyAppTime = testRun(nonProxyDemoApp);
        System.out.println("Time saved : " + (nonProxyAppTime - proxyAppTime) + "ms");
    }
}
