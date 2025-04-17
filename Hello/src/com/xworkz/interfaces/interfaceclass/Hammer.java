package com.xworkz.interfaces.interfaceclass;

public interface Hammer {
    void hit();
    void pull();
    void tap();

    default void beat() {
        System.out.println("Hammer used for pinning on the wall...");
    }
}
