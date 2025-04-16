package com.xworkz.interfaces.interface1.Chassis;

public class ChassisImpl implements Chassis {
    public void mount() {
        System.out.println("mount called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void align() {
        System.out.println("align called");
    }
    public static void main(String[] args) {
        Chassis obj = new ChassisImpl();
        obj.mount();
        obj.hold();
        obj.align();
    }
}
