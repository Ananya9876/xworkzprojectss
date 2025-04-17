package com.xworkz.interfaces.interfaceclass;

public interface Battery {
    void charge();
    void discharge();
    void recycle();

    default void batterydown() {
        System.out.println("Switch off due to battery down.");
    }
}
