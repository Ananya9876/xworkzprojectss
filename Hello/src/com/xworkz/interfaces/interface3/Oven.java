package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class Oven implements Chisel, Clamp, Compass, Component, Pump {
    public void fix() {
        System.out.println("fix called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void lock() {
        System.out.println("lock called");
    }
    public void carve() {
        System.out.println("carve called");
    }
    public void chip() {
        System.out.println("chip called");
    }
    public void shape() {
        System.out.println("shape called");
    }
    public void draw() {
        System.out.println("draw called");
    }
    public void measure() {
        System.out.println("measure called");
    }
    public void fit() {
        System.out.println("fit called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void test() {
        System.out.println("test called");
    }
    public void suction() {
        System.out.println("suction called");
    }
    public void pressure() {
        System.out.println("pressure called");
    }
    public void stop() {
        System.out.println("stop called");
    }


}
