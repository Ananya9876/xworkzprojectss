package com.xworkz.interfaces.interfaceclass;

public interface Fan {
    void blow();
    void oscillate();
    void cool();
    default void swing() {
        System.out.println("Swinging of the fan...");
    }

}
