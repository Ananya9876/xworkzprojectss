package com.xworkz.interfaces.interfaceclass;

public interface Bolt {
    void secure();
    void unscrew();
    void fasten();
    default void slower() {
        System.out.println("Slowing of the bolt.");
    }
}
