package com.xworkz.interfaces.interfaceclass;

public interface Vehicle {
    void start();
    void stop();
    void refuel();
    default void drive() {
        System.out.println("Driving...");
    }
}
