package com.xworkz.interfaces.interfaceclass;

public interface Washer {
    void cushion();
    void space();
    void seal();

    default void wash() {
        System.out.println("Washing clothes...");
    }

}
