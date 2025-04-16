package com.xworkz.interfaces.interface1.appliance;

public class StartAppliances implements Appliance {
    public void turnOn() {
        System.out.println("Turning on the appliance");
    }
    public void turnOff() {
        System.out.println("Turning off the appliance");
    }
    public void repair() {
        System.out.println("Repairing the appliance");
    }
}
