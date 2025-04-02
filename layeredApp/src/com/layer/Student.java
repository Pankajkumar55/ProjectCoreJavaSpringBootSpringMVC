package com.layer;

public class Student {

    String sName;
    String sDesg;
    String SAdd;
    int sId;

    public Student() {
    }

    public Student(String sName, String sDesg, String SAdd, int sId) {
        this.sName = sName;
        this.sDesg = sDesg;
        this.SAdd = SAdd;
        this.sId = sId;
    }


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsDesg() {
        return sDesg;
    }

    public void setsDesg(String sDesg) {
        this.sDesg = sDesg;
    }

    public String getSAdd() {
        return SAdd;
    }

    public void setSAdd(String SAdd) {
        this.SAdd = SAdd;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sDesg='" + sDesg + '\'' +
                ", SAdd='" + SAdd + '\'' +
                ", sId=" + sId +
                '}';
    }
}
