package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Gear;

public class GearImpl implements Gear {
    public void rotate() {
        System.out.println("rotate called");
    }
    public void interlock() {
        System.out.println("interlock called");
    }
    public void transfer() {
        System.out.println("transfer called");
    }
    public void paddle() {
        System.out.println("Paddling of the gear...");
    }
}
