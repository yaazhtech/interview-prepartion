package com.yaazhtech.training;

public abstract class SampleAbstractClass {
    public String collegeName;
    // purpose of constructor in abstract - cannot create object
    // purpose of Object - to class the class member such that call/access method/data (member of class)

    public String preValue;

    SampleAbstractClass(){
        // it can have constructor but its not used to create object for abstract class.
        // We have it to initialize the abstract variable
    }
    // example of abstract method
    public abstract void interestCal();

    // example of non-abstract method
    public void rateCal(){
        // it can have implementation
    }

}
