package com.xworkz.interfaces.interfaceclass;

public interface AppliancePart {
    void insert();
    void eject();
    void inspect();
    default void remove() {
        System.out.println("Remove the appliance part.");
    }
}
