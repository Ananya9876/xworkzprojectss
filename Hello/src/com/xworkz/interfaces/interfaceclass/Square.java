package com.xworkz.interfaces.interfaceclass;

public interface Square {
    void check();
    void mark();
    void align();
    default void measure() {
        System.out.println("Measuring");
    }
}
