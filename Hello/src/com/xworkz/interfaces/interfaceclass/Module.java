package com.xworkz.interfaces.interfaceclass;

public interface Module {
    void integrate();
    void isolate();
    void test();

    default void examin() {
        System.out.println("Examinig of the module...");
    }
}
