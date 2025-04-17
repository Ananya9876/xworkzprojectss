package com.xworkz.interfaces.interfaceclass;

public interface Sander {
    void smooth();
    void finish();
    void clean();

    default void shine() {
        System.out.println("Shining of the sander...");
    }

}
