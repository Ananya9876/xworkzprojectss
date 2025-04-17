package com.xworkz.interfaces.interfaceclass;

public interface Wall {
    void erect();
    void paint();
    void insulate();
    default void display() {
        System.out.println("Displaying image on screen...");
    }
}
