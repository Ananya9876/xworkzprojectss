package com.xworkz.interfaces.interfaceclass;

public interface Instrument {
    void play();
    void tune();
    void clean();

    default void measure() {
        System.out.println("Measuring of the instrument...");
    }

}
