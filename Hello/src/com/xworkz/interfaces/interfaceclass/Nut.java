package com.xworkz.interfaces.interfaceclass;

public interface Nut {
    void twist();
    void grip();
    void hold();
    default void squize() {
        System.out.println("Nut is twiisted...");
    }

}
