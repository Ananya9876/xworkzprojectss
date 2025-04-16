package com.xworkz.interfaces.interface1.Door;

public class DoorImpl implements Door {
    public void swing() {
        System.out.println("swing called");
    }
    public void latch() {
        System.out.println("latch called");
    }
    public void unlock() {
        System.out.println("unlock called");
    }
    public static void main(String[] args) {
        Door obj = new DoorImpl();
        obj.swing();
        obj.latch();
        obj.unlock();
    }
}
