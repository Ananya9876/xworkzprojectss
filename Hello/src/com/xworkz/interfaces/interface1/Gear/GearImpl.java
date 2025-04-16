package com.xworkz.interfaces.interface1.Gear;

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
    public static void main(String[] args) {
        Gear obj = new GearImpl();
        obj.rotate();
        obj.interlock();
        obj.transfer();
    }
}
