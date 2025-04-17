package com.xworkz.interfaces.interfaceclass;

public interface Spring {
    void compress();
    void release();
    void bounce();
    default void ring() {
        System.out.println("Alarm is ringing...");
    }

}
