package com.xworkz.interfaces.interfaceclass;

public interface Motor {
    void run();
    void speedUp();
    void slowDown();

    default void ring() {
        System.out.println("Alarm is ringing...");
    }

}
