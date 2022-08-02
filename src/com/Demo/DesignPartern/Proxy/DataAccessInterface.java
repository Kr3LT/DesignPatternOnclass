package com.Demo.DesignPartern.Proxy;

import java.util.HashMap;

public interface DataAccessInterface {
    HashMap<String, SinhVien> getAllSinhVien();
    SinhVien getSinhVien(String id);
}
