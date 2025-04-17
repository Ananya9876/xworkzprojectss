package com.xworkz.interfaces.interfaceclass;

public interface Plane {
    void shave();
    void level();
    void finish();

    default void clean() {
        System.out.println("Plane is clean...");
    }

}
