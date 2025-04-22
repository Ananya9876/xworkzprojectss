package com.xworkz.abstraction.internal;

public class MonitorImpl implements Monitor {
    @Override
    public void brew() {
        System.out.println("Brewing the coffee in Monitor.");
    }
}
