package com.xworkz.interfaces.interfaceclass;

public interface Chassis {
    void mount();
    void hold();
    void align();

    default void leave() {
        System.out.println("ALeaving of the chass");
    }
}
