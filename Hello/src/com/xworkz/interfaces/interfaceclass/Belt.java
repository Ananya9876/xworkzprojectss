package com.xworkz.interfaces.interfaceclass;

public interface Belt {
    void tension();
    void move();
    void slip();

    default void color() {
        System.out.println("color is usually brown and black.");
    }
}
