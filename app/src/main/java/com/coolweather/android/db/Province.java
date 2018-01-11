package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 123 on 2018/1/10.
 */

public class Province extends DataSupport{
    private int provinceCode;
    private int id;
    private String provinceName;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String proviceName){
    this.provinceName = provinceName;
    }
    public int getProvinceCode(){
        return provinceCode = provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}


