package com.deneme.h2jpa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String department;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
