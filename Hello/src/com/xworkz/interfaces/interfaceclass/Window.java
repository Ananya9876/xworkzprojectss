package com.xworkz.interfaces.interfaceclass;

public interface Window {
    void open();
    void close();
    void lock();
    default void color() {
        System.out.println("Coloring to the window");
    }
}
