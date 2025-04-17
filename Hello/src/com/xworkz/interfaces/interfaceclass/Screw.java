package com.xworkz.interfaces.interfaceclass;

public interface Screw {
    void thread();
    void tighten();
    void loosen();

    default void remove() {
        System.out.println("Removing...");
    }

}
