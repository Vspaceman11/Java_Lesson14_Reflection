package com.java.study.task2;

public class ReflectionTestClass {
    int number = 10;
    public double d = 15.3;
    private String str = "Hello";

    public ReflectionTestClass(){}
    public ReflectionTestClass(int number, double d, String str) {
        this.number = number;
        this.d = d;
        this.str = str;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
