package com.xworkz.interfaces.interfaceclass;

public interface Cover {
    void place();
    void remove();
    void protect();

    default void clean() {
        System.out.println("Cleaning the cover..");
    }

}
