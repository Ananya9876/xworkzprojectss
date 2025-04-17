package com.xworkz.interfaces.interfaceclass;

public interface Hinge {
    void pivot();
    void align();
    void rust();
    default void bust() {
        System.out.println("Hinge is busting...");
    }

}
