package com.xworkz.interfaces.interfaceclass;

public interface Accessory {
    void attach();

    void detach();

    void clean();

    default void wear() {
        System.out.println("SmartDevice interface - default info: Connects and operates smartly.");
    }
}

