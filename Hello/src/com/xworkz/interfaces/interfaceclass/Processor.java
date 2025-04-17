package com.xworkz.interfaces.interfaceclass;

public interface Processor {
    void compute();
    void analyze();
    void optimize();
    default void defuse() {
        System.out.println("Defusing...");
    }

}
