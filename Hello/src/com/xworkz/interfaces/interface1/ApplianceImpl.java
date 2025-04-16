package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Appliance;

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

}
