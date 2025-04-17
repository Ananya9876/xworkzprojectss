package com.xworkz.interfaces.interfaceclass;

public interface Machine {
    void operate();
    void shutDown();
    void calibrate();

    default void run() {
        System.out.println("Alarm is ringing...");
    }

}
