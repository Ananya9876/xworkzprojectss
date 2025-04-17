package com.xworkz.interfaces.interfaceclass;

public interface Tank {
    void fill();
    void drain();
    void seal();
    default void quantity() {
        System.out.println("Quantity of water");
    }
}
