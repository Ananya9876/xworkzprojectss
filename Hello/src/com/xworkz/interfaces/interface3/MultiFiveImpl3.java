package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class MultiFiveImpl3 implements Appliance, AppliancePart, Battery, Belt, Nut {
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
    public void tension() {
        System.out.println("tension called");
    }
    public void move() {
        System.out.println("move called");
    }
    public void slip() {
        System.out.println("slip called");
    }
    public void charge() {
        System.out.println("charge called");
    }
    public void discharge() {
        System.out.println("discharge called");
    }
    public void recycle() {
        System.out.println("recycle called");
    }
    public void twist() {
        System.out.println("twist called");
    }
    public void grip() {
        System.out.println("grip called");
    }
    public void hold() {
        System.out.println("hold called");
    }


}
