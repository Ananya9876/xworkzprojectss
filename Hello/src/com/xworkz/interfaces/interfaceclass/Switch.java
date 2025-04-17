package com.xworkz.interfaces.interfaceclass;

public interface Switch {
    void toggle();
    void enable();
    void disable();
    default void insert() {
        System.out.println("Card inserted into ATM...");
    }
}
