package com.xworkz.interfaces.interfaceclass;

public interface Controller {
    void program();
    void execute();
    void reset();
    default void debug() {
        System.out.println("Bebug the program...");
    }

}
