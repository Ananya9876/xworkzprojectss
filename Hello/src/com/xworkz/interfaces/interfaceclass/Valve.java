package com.xworkz.interfaces.interfaceclass;

public interface Valve {
    void open();
    void close();
    void regulate();

    default void clean() {
        System.out.println("Cleaning the floor...");
    }

}
