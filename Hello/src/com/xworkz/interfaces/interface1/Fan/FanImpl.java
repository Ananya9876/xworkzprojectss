package com.xworkz.interfaces.interface1.Fan;

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
    public static void main(String[] args) {
        Fan obj = new FanImpl();
        obj.blow();
        obj.oscillate();
        obj.cool();
    }
}
