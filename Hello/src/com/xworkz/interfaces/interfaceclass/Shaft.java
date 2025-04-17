package com.xworkz.interfaces.interfaceclass;

public interface Shaft {
    void spin();
    void hold();
    void balance();
    default void move() {
        System.out.println("Move...");
    }

}
