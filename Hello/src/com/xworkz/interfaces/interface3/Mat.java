package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class Mat implements Caliper, Casing, Charger, Chassis, Roof {
    public void measure() {
        System.out.println("measure called");
    }
    public void read() {
        System.out.println("read called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public void enclose() {
        System.out.println("enclose called");
    }
    public void shield() {
        System.out.println("shield called");
    }
    public void label() {
        System.out.println("label called");
    }
    public void connect() {
        System.out.println("connect called");
    }
    public void power() {
        System.out.println("power called");
    }
    public void disconnect() {
        System.out.println("disconnect called");
    }
    public void mount() {
        System.out.println("mount called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void cover() {
        System.out.println("cover called");
    }
    public void drain() {
        System.out.println("drain called");
    }
    public void ventilate() {
        System.out.println("ventilate called");
    }


}
