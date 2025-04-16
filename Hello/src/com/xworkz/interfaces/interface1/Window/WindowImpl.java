package com.xworkz.interfaces.interface1.Window;

public class WindowImpl implements Window {
    public void open() {
        System.out.println("open called");
    }
    public void close() {
        System.out.println("close called");
    }
    public void lock() {
        System.out.println("lock called");
    }
    public static void main(String[] args) {
        Window obj = new WindowImpl();
        obj.open();
        obj.close();
        obj.lock();
    }
}
