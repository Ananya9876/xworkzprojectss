package com.xworkz.interfaces.interfaceclass;

public interface Filter {
    void trap();
    void clean();
    void replace();

    default void filter() {
        System.out.println("Flitering of the water...");
    }

}
