package com.xworkz.interfaces.interface1.Foundation;

public class FoundationImpl implements Foundation {
    public void set() {
        System.out.println("set called");
    }
    public void level() {
        System.out.println("level called");
    }
    public void cure() {
        System.out.println("cure called");
    }
    public static void main(String[] args) {
        Foundation obj = new FoundationImpl();
        obj.set();
        obj.level();
        obj.cure();
    }
}
