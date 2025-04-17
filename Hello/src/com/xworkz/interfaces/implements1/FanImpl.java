package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Fan;

public class FanImpl implements Fan {
    public void blow() {
        System.out.println("blow called");
    }
    public void oscillate() {
        System.out.println("oscillate called");
    }
    public void cool() {
        System.out.println("cool called");
    }
    public void swing() {
        System.out.println("Swinging of the fan...");
    }
}
