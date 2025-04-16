package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Vehicle;

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

}
