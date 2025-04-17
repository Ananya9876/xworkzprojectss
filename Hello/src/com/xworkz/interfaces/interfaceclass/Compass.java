package com.xworkz.interfaces.interfaceclass;

public interface Compass {
    void draw();
    void adjust();
    void measure();

    default void fix() {
        System.out.println("Fixing...");
    }
}
