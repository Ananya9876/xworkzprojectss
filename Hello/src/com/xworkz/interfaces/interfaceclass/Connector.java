package com.xworkz.interfaces.interfaceclass;

public interface Connector {
    void link();
    void secure();
    void release();

    default void info() {
        System.out.println("Information...");
    }

}
