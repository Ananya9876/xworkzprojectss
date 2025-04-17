package com.xworkz.interfaces.interfaceclass;

public interface TapeMeasure {
    void extend();
    void retract();
    void read();
    default void preserve() {
        System.out.println("Preserving food at low temperature...");
    }
}
