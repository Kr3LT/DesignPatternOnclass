package com.Demo.DesignPartern.Proxy;

public class SinhVien {
    private String id;
    private String name;

    public SinhVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SinhVien() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
