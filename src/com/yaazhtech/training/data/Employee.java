package com.yaazhtech.training.data;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Cloneable, Serializable { //hashCode Heap empRef [,refName,refPan] ["name"."pan"                                    ]
    private StringBuilder name;// name has own hashcode "name"
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
 private Employee(){}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getPan(), employee.getPan());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPan());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                '}';
    }


}
