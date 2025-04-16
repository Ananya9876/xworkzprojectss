package com.xworkz.interfaces.interface1.Hinge;

public class HingeImpl implements Hinge {
    public void pivot() {
        System.out.println("pivot called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void rust() {
        System.out.println("rust called");
    }
    public static void main(String[] args) {
        Hinge obj = new HingeImpl();
        obj.pivot();
        obj.align();
        obj.rust();
    }
}
