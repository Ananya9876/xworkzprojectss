package com.xworkz.interfaces.interfaceclass;

public interface Utility {
    void run();
    void monitor();
    void terminate();
    default void trackSteps() {
        System.out.println("Tracking steps and health...");
    }
}
