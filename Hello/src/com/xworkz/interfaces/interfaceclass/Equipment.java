package com.xworkz.interfaces.interfaceclass;

public interface Equipment {
    void install();
    void uninstall();
    void update();
    default void edit() {
        System.out.println("Edit the equipment...");
    }

}
