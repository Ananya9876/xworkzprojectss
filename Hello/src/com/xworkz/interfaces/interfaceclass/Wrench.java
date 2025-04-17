package com.xworkz.interfaces.interfaceclass;

public interface Wrench {
    void twist();
    void turn();
    void hold();

    default void use() {
        System.out.println("Using of the wrench");
    }
}
