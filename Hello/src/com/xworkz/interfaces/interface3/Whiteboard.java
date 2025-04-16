package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class Whiteboard implements Tool, Appliance,Accessory, Actuator {
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

    public void attach() {
        System.out.println("attach called");
    }

    public void detach() {
        System.out.println("detach called");
    }

    public void clean() {
        System.out.println("clean called");
    }

    public void engage() {
        System.out.println("engage called");
    }

    public void disengage() {
        System.out.println("disengage called");
    }

    public void calibrate() {
        System.out.println("calibrate called");
    }

}