package com.xworkz.interfaces.interfaceclass;

public interface Level {
    void measure();
    void align();
    void indicate();

    default void place() {
        System.out.println("Level is placed...");
    }

}
