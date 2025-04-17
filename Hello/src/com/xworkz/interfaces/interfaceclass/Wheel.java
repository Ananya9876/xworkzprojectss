package com.xworkz.interfaces.interfaceclass;

public interface Wheel {
    void spin();
    void stop();
    void align();
    default void throwing() {
        System.out.println("Throwing of the tyre");
    }
}
