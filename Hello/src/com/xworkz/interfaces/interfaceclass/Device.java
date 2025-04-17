package com.xworkz.interfaces.interfaceclass;

public interface Device {
    void powerUp();
    void powerDown();
    void reset();
    default void run() {
        System.out.println("Working...");
    }

}
