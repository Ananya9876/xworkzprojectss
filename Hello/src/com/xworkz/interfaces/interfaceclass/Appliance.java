package com.xworkz.interfaces.interfaceclass;

public interface Appliance {
    void turnOn();
    void turnOff();
    void repair();

    default void work() {
        System.out.println("Working....");
    }
}
