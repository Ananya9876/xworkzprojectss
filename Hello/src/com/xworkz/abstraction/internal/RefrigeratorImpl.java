package com.xworkz.abstraction.internal;

public class RefrigeratorImpl implements Refrigerator {
    @Override
    public void stop() {
        System.out.println("Stopping the device in Refrigerator.");
    }
}
