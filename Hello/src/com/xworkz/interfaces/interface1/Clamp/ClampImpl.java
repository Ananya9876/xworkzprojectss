package com.xworkz.interfaces.interface1.Clamp;

public class ClampImpl implements Clamp {
    public void fix() {
        System.out.println("fix called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void lock() {
        System.out.println("lock called");
    }
    public static void main(String[] args) {
        Clamp obj = new ClampImpl();
        obj.fix();
        obj.adjust();
        obj.lock();
    }
}
