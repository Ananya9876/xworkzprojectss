package com.xworkz.interfaces.interfaceclass;

public interface Drill {
    void bore();
    void reverse();
    void stop();

    default void work() {
        System.out.println("To make holes on the wall...");
    }

}
