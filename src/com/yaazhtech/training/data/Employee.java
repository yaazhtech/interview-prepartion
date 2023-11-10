package com.yaazhtech.training.data;

import java.util.Objects;

public class Employee {
    private StringBuilder name;// name has own hashcode
    private StringBuilder pan; // pan has own hashcode

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getPan() {
        return pan;
    }

    public void setPan(StringBuilder pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                '}';
    }


}
