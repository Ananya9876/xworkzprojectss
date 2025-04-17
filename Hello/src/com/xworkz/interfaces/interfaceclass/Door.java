package com.xworkz.interfaces.interfaceclass;

public interface Door {
    void swing();
    void latch();
    void unlock();
    default void lock() {
        System.out.println("Door is locked...");
    }

}
