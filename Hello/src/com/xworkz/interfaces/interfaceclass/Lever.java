package com.xworkz.interfaces.interfaceclass;

public interface Lever {
    void pull();
    void push();
    void lock();

    default void unlock() {
        System.out.println("Unlock...");
    }

}
