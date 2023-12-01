package com.yaazhtech.training.collections;

import java.util.Objects;

public class User {
    String name;
    String pan;
    String aadhar;
    String password;
   
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return pan.equals(user.pan) && aadhar.equals(user.aadhar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pan, aadhar);
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

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                ", aadhar='" + aadhar + '\'' +
                ", password='" + password + '\'' +
                ", hashcode='" + hashCode() + '\'' +
                '}';
    }
}
