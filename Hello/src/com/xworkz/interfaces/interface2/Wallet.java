package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Caliper;
import com.xworkz.interfaces.interfaceclass.Casing;

public class Wallet implements Caliper, Casing {
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

}
