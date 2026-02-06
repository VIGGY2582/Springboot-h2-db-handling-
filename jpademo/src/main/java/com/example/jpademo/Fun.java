package com.example.jpademo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fun {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String mike1;
    private String mike2;

    public Fun(){}//default constructor required by jpa
    public  Fun(String mike1,String mike2){
        this.mike2=mike2;
        this.mike1=mike1;
    }

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getMike1() {
        return mike1;
    }
    public void setMike1(String m1){
        this.mike1=m1;
    }

    public String getMike2() {
        return mike2;
    }
    public void setMike2(String m2){
        this.mike2=m2;
    }

}