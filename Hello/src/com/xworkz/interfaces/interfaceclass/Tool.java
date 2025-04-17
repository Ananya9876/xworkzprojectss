package com.xworkz.interfaces.interfaceclass;

public interface Tool {
    void use();
    void maintain();
    void store();
    default void operate() {
        System.out.println("Robot performing operation...");
    }
}
