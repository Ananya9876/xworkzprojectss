package com.xworkz.interfaces.interfaceclass;

public interface Frame {
    void support();
    void secure();
    void stabilize();
    default void hang() {
        System.out.println("Hang on the wall...");
    }

}
