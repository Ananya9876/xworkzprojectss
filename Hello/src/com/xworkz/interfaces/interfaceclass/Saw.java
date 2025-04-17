package com.xworkz.interfaces.interfaceclass;

public interface Saw {
    void cut();
    void guide();
    void rest();

    default void see() {
        System.out.println("Seeing of the saw...");
    }
}
