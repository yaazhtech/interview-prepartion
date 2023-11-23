package com.yaazhtech.training;

import com.yaazhtech.training.data.Employee;
import com.yaazhtech.training.data.EmployeeWithImMutableObjects;
// build path and classpath ezhil
public class DriverClass {

    String name; // access by objectRef
    static String pan; // access by ClassName

    public static void abcFuction(){} // access/ call this function by className
    public  void abcFuctionsdfds(){} // access/call by objectRef

// purpose of constructor - To create object
    // purpose of Object - to class the class member such that call/access method/data (member of class)
    public void main(String[] args) throws CloneNotSupportedException {
        System.out.println("I am printing from main method/function");
        DriverClass.newMethod();// class name used to call static member

        DriverClass objectRef = new DriverClass();// ref and object / instance

        objectRef.newNonStaticMethod();// can be accessed only via object

        System.out.println("Get print data from interface: "+SampleInterface.getHorsePower(10,1));
// In case of mutable object
        Employee e1= new Employee(); // has own hashcode
        e1.setName(new StringBuilder("abc"));
        e1.setPan(new StringBuilder("ABC2346M"));
        Employee e2=new Employee();// has own hashcode
        e2.setName(new StringBuilder("abc"));
        e2.setPan(new StringBuilder("ABC2346M"));
        System.out.println("I am printing the employee object withOUT toString E1: \t\t"+e1.toString());
        System.out.println("I am printing the employee object withOUT toString E2: \t\t"+e2.toString());
        System.out.println("I am printing hashCode for E1: \t\t"+e1.hashCode());
        System.out.println("I am printing hashCode for E1-> name: \t\t"+e1.getName().hashCode());
        System.out.println("I am printing hashCode for E1-> pan: \t\t"+e1.getPan().hashCode());

        System.out.println("I am printing hashCode for E2: \t\t"+e2.hashCode());
        System.out.println("I am printing hashCode for E2-> name: \t\t"+e2.getName().hashCode());
        System.out.println("I am printing hashCode for E1:-> pan \t\t"+e2.getPan().hashCode());

        System.out.println("I am comparing e1 and e2  \t\t"+e1.equals(e2));
        System.out.println("I am comparing e1 name and e2 name  \t\t"+e1.getName().equals(e2.getName()));

        //System.out.println("I am printing the employee object WITH toString"+e1.toString());
// how many object heap memory 6 in case of mutable
        // In case of immutable object
        EmployeeWithImMutableObjects eIm1=new EmployeeWithImMutableObjects(); // has own hashcode


        eIm1.setName("abc");
        eIm1.setPan("ABC2346M");
        EmployeeWithImMutableObjects eIm2=new EmployeeWithImMutableObjects();// has own hashcode
        eIm2.setName("abc");
        eIm2.setPan("ABC2346M");
        System.out.println("I am printing the employee object withOUT toString eIm1: \t\t"+eIm1.toString());
        System.out.println("I am printing the employee object withOUT toString eIm2: \t\t"+eIm2.toString());
        System.out.println("I am printing hashCode for eIm1: \t\t"+eIm1.hashCode());
        System.out.println("I am printing hashCode for eIm1-> name: \t\t"+eIm1.getName().hashCode());
        System.out.println("I am printing hashCode for eIm1-> pan: \t\t"+eIm1.getPan().hashCode());

        System.out.println("I am printing hashCode for eIm2: \t\t"+eIm2.hashCode());
        System.out.println("I am printing hashCode for eIm2-> name: \t\t"+eIm2.getName().hashCode());
        System.out.println("I am printing hashCode for eIm2:-> pan \t\t"+eIm2.getPan().hashCode());

        System.out.println("I am comparing eIm1 and eIm2  \t\t"+eIm1.equals(eIm2));
        System.out.println("I am comparing eIm1 name and eIm2 name  \t\t"+eIm1.getName().equals(eIm2.getName()));



        // how many object heap memory 6 in case of Immutable
    }

    public static void newMethod() {
        System.out.println("I am printing from newMethod");

    }

    public void newNonStaticMethod() {
        System.out.println("I am printing from non static newMethod");

    }

}

