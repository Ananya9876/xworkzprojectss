package com.xworkz.interfaces.interfaceclass;

public interface Seal {
    void compress();
    void stretch();
    void hold();

    default void measure() {
        System.out.println("Measurement of the seal");
    }

}
