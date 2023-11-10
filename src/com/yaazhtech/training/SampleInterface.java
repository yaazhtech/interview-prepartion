package com.yaazhtech.training;

public interface SampleInterface {

    String collegeName = "PSG";
    // constructor in interface - No (1.)
    // why = it has only declartion, default, static, data member (final)

    // do not have constrcutor


    // regular interface methods

    // regular / static interface methods
    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
    // regular / default interface methods
    default void defaultMethod() {
        // default method implementation
    }

}
