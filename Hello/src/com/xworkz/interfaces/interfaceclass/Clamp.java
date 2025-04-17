package com.xworkz.interfaces.interfaceclass;

public interface Clamp {
    void fix();
    void adjust();
    void lock();
    default void error() {
        System.out.println("Error in the clamp.");
    }
}
