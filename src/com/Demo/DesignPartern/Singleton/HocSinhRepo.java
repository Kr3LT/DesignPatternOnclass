package com.Demo.DesignPartern.Singleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HocSinhRepo {
    private static List<String> _lstHocSinh = null;
    private static Date _lastGetTime = null;
    public static List<String> getHocSinhList(){
        if(_lstHocSinh == null){ // ||
            // now() - _lastgetTime > 1 days ){
            _lastGetTime = new Date();
            // update _lastGetTime
            _lstHocSinh = new ArrayList<String>();
            _lstHocSinh.add("Nguyên");
            _lstHocSinh.add("Trần");
            return _lstHocSinh;
        }
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return _lstHocSinh;
    }
}
