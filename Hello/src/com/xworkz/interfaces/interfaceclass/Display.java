package com.xworkz.interfaces.interfaceclass;

public interface Display {
    void show();
    void refresh();
    void clear();

    default void remove() {
        System.out.println("Display is removed...");
    }

}
