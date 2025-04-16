package com.xworkz.interfaces.interface1.TapeMeasure;

public class TapeMeasureImpl implements TapeMeasure {
    public void extend() {
        System.out.println("extend called");
    }
    public void retract() {
        System.out.println("retract called");
    }
    public void read() {
        System.out.println("read called");
    }
    public static void main(String[] args) {
        TapeMeasure obj = new TapeMeasureImpl();
        obj.extend();
        obj.retract();
        obj.read();
    }
}
