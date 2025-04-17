package com.xworkz.interfaces.interfaceclass;

public interface Chisel {
    void carve();
    void chip();
    void shape();
    default void size() {
        System.out.println("Sizing of the chisel.");
    }
}
