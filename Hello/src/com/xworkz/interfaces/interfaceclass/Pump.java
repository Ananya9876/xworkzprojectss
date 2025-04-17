package com.xworkz.interfaces.interfaceclass;

public interface Pump {
    void suction();
    void pressure();
    void stop();
    default void repair() {
        System.out.println("Water pumping..");
    }

}
