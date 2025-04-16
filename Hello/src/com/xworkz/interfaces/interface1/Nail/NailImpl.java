package com.xworkz.interfaces.interface1.Nail;

public class NailImpl implements Nail {
    public void drive() {
        System.out.println("drive called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public static void main(String[] args) {
        Nail obj = new NailImpl();
        obj.drive();
        obj.hold();
        obj.pull();
    }
}
