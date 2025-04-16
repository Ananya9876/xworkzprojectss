package com.xworkz.interfaces.interface1.Compass;

public class CompassImpl implements Compass {
    public void draw() {
        System.out.println("draw called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void measure() {
        System.out.println("measure called");
    }
    public static void main(String[] args) {
        Compass obj = new CompassImpl();
        obj.draw();
        obj.adjust();
        obj.measure();
    }
}
