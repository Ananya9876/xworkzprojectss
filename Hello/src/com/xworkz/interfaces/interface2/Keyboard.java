package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Appliance;
import com.xworkz.interfaces.interfaceclass.Tool;

public class Keyboard implements Tool, Appliance {
    public void use() {
        System.out.println("use called");
    }
    public void maintain() {
        System.out.println("maintain called");
    }
    public void store() {
        System.out.println("store called");
    }
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
