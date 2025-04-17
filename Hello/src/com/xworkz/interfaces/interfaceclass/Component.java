package com.xworkz.interfaces.interfaceclass;

public interface Component {
    void fit();
    void remove();
    void test();
    default void adjust() {
        System.out.println("Adjustment of the component.");
    }
}
