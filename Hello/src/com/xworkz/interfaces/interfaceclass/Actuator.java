package com.xworkz.interfaces.interfaceclass;

public interface Actuator {
    void engage();
    void disengage();
    void calibrate();


    default void checkstatus() {
        System.out.println("Actuator status: Ready and operational.");
    }
}
