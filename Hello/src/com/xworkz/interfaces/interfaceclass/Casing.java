package com.xworkz.interfaces.interfaceclass;

public interface Casing {
    void enclose();
    void shield();
    void label();
    default void open() {
        System.out.println("Opening of the case.");
    }
}
