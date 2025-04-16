package com.xworkz.interfaces.interface1.Panel;

public class PanelImpl implements Panel {
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
        Panel obj = new PanelImpl();
        obj.open();
        obj.close();
        obj.lock();
    }
}
