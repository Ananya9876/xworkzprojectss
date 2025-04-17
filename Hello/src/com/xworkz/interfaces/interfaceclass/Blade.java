package com.xworkz.interfaces.interfaceclass;

public interface Blade {
    void cut();
    void sharpen();
    void store();

    default void shape() {
        System.out.println("Rectangular shape...");
    }
}
