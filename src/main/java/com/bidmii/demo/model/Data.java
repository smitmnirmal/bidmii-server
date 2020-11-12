package com.bidmii.demo.model;

import java.util.List;

public class Data{
    private String status;
    private List<Employee> data;
    private String message;

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setData(List<Employee> data){
        this.data = data;
    }
    public List<Employee> getData(){
        return this.data;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}