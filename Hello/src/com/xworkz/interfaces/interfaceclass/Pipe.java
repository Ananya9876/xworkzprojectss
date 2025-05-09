package com.xworkz.interfaces.interfaceclass;

public interface Pipe {
    void carry();
    void leakCheck();
    void insulate();

    default void repair() {
        System.out.println("Repairing...");
    }

}
