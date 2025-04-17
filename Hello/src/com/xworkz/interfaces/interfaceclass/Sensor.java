package com.xworkz.interfaces.interfaceclass;

public interface Sensor {
    void detect();
    void measure();
    void alert();

    default void color() {
        System.out.println("Red in color...");
    }

}
