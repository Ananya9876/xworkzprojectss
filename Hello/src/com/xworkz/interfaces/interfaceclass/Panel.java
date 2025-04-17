package com.xworkz.interfaces.interfaceclass;

public interface Panel {
    void open();
    void close();
    void lock();
    default void space() {
        System.out.println("There are 4 spaces...");
    }

}
