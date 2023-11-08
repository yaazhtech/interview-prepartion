package com.yaazhtech.training;

public class DriverClass {
// purpose of constructor - To create object
    // purpose of Object - to class the class member such that call/access method/data (member of class)
    public static void main(String[] args) {
        System.out.println("I am printing from main method/function");
        DriverClass.newMethod();// class name used to call static member

        DriverClass objectRef = new DriverClass();// ref and object
        objectRef.newNonStaticMethod();// can be accessed only via object

    }

    public static void newMethod() {
        System.out.println("I am printing from newMethod");

    }

    public void newNonStaticMethod() {
        System.out.println("I am printing from non static newMethod");

    }

}

