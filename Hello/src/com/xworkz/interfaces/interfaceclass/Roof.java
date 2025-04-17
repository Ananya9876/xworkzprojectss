package com.xworkz.interfaces.interfaceclass;

public interface Roof {
    void cover();
    void drain();
    void ventilate();
    default void shield() {
        System.out.println("Shield...");
    }

}
