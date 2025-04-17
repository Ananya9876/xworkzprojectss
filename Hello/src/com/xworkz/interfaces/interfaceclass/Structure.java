package com.xworkz.interfaces.interfaceclass;

public interface Structure {
    void build();
    void strengthen();
    void maintain();
    default void trackSteps() {
        System.out.println("Tracking steps and health...");
    }
}
