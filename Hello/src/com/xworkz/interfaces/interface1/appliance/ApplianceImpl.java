package com.xworkz.interfaces.interface1.appliance;

public class ApplianceImpl implements Appliance {
    public void turnOn() {
        System.out.println("turnOn called");
    }
    public void turnOff() {
        System.out.println("turnOff called");
    }
    public void repair() {
        System.out.println("repair called");
    }
    public static void main(String[] args) {
        Appliance obj = new ApplianceImpl();
        obj.turnOn();
        obj.turnOff();
        obj.repair();
    }
}
