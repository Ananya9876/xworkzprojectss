package com.xworkz.interfaces.interface1.Hammer;

public class HammerImpl implements Hammer {
    public void hit() {
        System.out.println("hit called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void tap() {
        System.out.println("tap called");
    }
    public static void main(String[] args) {
        Hammer obj = new HammerImpl();
        obj.hit();
        obj.pull();
        obj.tap();
    }
}
