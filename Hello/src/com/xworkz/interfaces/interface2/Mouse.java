package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Appliance;
import com.xworkz.interfaces.interfaceclass.AppliancePart;

public class Mouse implements Appliance, AppliancePart {
    public void turnOn() {
        System.out.println("turnOn called");
    }
    public void turnOff() {
        System.out.println("turnOff called");
    }
    public void repair() {
        System.out.println("repair called");
    }
    public void insert() {
        System.out.println("insert called");
    }
    public void eject() {
        System.out.println("eject called");
    }
    public void inspect() {
        System.out.println("inspect called");
    }
}
