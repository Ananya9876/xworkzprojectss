package com.xworkz.interfaces.interfaceclass;

public interface Charger {
    void connect();
    void power();
    void disconnect();

    default void poweron() {
        System.out.println("Charging of the phone");
    }
}
