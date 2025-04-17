package com.xworkz.interfaces.interfaceclass;

public interface Cable {
    void plugIn();
    void transmit();
    void unplug();
    default void plug() {
        System.out.println("Plugging to the switch.");
    }
}
