package com.Demo.DesignPartern.SimpleFactory;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoProgram {
    public static void main(String[] args) {
        DienThoaiFactory nhamay;
        DienThoai dt;
        DemoProgram p = new DemoProgram();
        nhamay = p.readNhaMay("D:\\SpringBoots\\ExampleCode\\src\\com\\Demo\\DesignPartern\\SimpleFactory\\application.ini");
        //nhamay = new SamsungFactory();
        dt = nhamay.getDienThoai();
        dt.doChuong();
        dt.nhanTin("09123", "hello");
    }
    public DienThoaiFactory readNhaMay(String file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.ready()){
                String line = bufferedReader.readLine();
                String[] splitedLine = line.split("=");
                if(splitedLine[0].equals("nhamay")) {
                    if (splitedLine[1].contains("Apple")){
                        return new AppleFactory();
                    }else if(splitedLine[1].contains("Samsung")) return new SamsungFactory();
                    else {return new XiaomiFactory();}
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
