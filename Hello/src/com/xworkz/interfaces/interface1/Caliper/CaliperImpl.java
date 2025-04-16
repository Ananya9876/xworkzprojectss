package com.xworkz.interfaces.interface1.Caliper;

public class CaliperImpl implements Caliper {
    public void measure() {
        System.out.println("measure called");
    }
    public void read() {
        System.out.println("read called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public static void main(String[] args) {
        Caliper obj = new CaliperImpl();
        obj.measure();
        obj.read();
        obj.reset();
    }
}
