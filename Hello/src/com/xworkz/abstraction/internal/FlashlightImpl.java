package com.xworkz.abstraction.internal;

public class FlashlightImpl implements Flashlight {
    @Override
    public void lock() {
        System.out.println("Locking the system in Flashlight.");
    }
}
