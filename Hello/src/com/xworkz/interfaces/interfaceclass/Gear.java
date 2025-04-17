package com.xworkz.interfaces.interfaceclass;

public interface Gear {
    void rotate();
    void interlock();
    void transfer();

    default void paddle() {
        System.out.println("Paddling of the gear...");
    }

}
