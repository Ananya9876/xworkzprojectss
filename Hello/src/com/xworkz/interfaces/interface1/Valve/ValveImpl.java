package com.xworkz.interfaces.interface1.Valve;

public class ValveImpl implements Valve {
    public void open() {
        System.out.println("open called");
    }
    public void close() {
        System.out.println("close called");
    }
    public void regulate() {
        System.out.println("regulate called");
    }
    public static void main(String[] args) {
        Valve obj = new ValveImpl();
        obj.open();
        obj.close();
        obj.regulate();
    }
}
