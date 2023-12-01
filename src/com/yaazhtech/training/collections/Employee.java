package com.yaazhtech.training.collections;

public final class Employee {
    private String name;
    private String pan;
    private String passWord;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                ", passWord='" + passWord + '\'' +
                ", hashcode='" + hashCode() + '\'' +'}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
