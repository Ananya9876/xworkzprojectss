package com.xworkz.interfaces.interfaceclass;

public interface Caliper {
    void measure();
    void read();
    void reset();
    default void write() {
        System.out.println("Writing...");
    }
}
