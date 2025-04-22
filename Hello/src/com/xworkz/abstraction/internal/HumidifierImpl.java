package com.xworkz.abstraction.internal;

public class HumidifierImpl implements Humidifier {
    @Override
    public void flash() {
        System.out.println("Flashing the light in Humidifier.");
    }
}
