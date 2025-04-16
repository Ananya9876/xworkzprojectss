package com.xworkz.interfaces.interface1.Knob;

public class KnobImpl implements Knob {
    public void rotate() {
        System.out.println("rotate called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }
    public static void main(String[] args) {
        Knob obj = new KnobImpl();
        obj.rotate();
        obj.adjust();
        obj.calibrate();
    }
}
