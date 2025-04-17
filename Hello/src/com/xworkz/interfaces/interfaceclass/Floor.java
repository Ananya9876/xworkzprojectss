package com.xworkz.interfaces.interfaceclass;

public interface Floor {
    void lay();
    void tile();
    void polish();

    default void total() {
        System.out.println("Totally 4 floors...");
    }

}
