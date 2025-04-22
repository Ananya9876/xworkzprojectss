package com.xworkz.abstraction.internal;

public class ClockImpl implements Clock {
    @Override
    public void heat() {
        System.out.println("Heating the water in Clock.");
    }
}
