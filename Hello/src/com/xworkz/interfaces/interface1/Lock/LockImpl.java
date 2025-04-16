package com.xworkz.interfaces.interface1.Lock;

public class LockImpl implements Lock {
    public void secure() {
        System.out.println("secure called");
    }
    public void open() {
        System.out.println("open called");
    }
    public void jam() {
        System.out.println("jam called");
    }
    public static void main(String[] args) {
        Lock obj = new LockImpl();
        obj.secure();
        obj.open();
        obj.jam();
    }
}
