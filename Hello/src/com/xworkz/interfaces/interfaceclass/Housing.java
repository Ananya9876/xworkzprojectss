package com.xworkz.interfaces.interfaceclass;

public interface Housing {
    void surround();
    void protect();
    void vent();

    default void floor() {
        System.out.println("Floor is build..");
    }

}
