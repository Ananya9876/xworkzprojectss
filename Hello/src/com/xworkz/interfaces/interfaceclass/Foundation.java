package com.xworkz.interfaces.interfaceclass;

public interface Foundation {
    void set();
    void level();
    void cure();
    default void build() {
        System.out.println("Building is built...");
    }

}
