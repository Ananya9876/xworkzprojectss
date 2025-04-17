package com.xworkz.interfaces.interfaceclass;

public interface Nail {
    void drive();
    void hold();
    void pull();
    default void color() {
        System.out.println("coloring of the nails...");
    }

}
