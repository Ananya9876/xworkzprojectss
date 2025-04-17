package com.xworkz.interfaces.interfaceclass;

public interface Handle {
    void grip();
    void twist();
    void pull();
    default void use() {
        System.out.println("Usage of handle...");
    }

}
