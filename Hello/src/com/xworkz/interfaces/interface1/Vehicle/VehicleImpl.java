package com.xworkz.interfaces.interface1.Vehicle;

public class VehicleImpl implements Vehicle {
    public void start() {
        System.out.println("start called");
    }
    public void stop() {
        System.out.println("stop called");
    }
    public void refuel() {
        System.out.println("refuel called");
    }
    public static void main(String[] args) {
        Vehicle obj = new VehicleImpl();
        obj.start();
        obj.stop();
        obj.refuel();
    }
}
