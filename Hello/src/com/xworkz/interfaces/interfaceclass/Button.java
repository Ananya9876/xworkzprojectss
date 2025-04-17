package com.xworkz.interfaces.interfaceclass;

public interface Button {
    void press();
    void release();
    void reset();
    default void shell() {
        System.out.println("Working with shell.");
    }
}
