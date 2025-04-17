package com.xworkz.interfaces.interfaceclass;

public interface Engine {
    void ignite();
    void throttle();
    void idle();
    default void engineon() {
        System.out.println("Engine is on...");
    }

}
