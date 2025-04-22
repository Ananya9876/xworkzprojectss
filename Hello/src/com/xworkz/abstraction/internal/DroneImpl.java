package com.xworkz.abstraction.internal;

public class DroneImpl implements Drone {
    @Override
    public void unlock() {
        System.out.println("Unlocking the door in Drone.");
    }
}
