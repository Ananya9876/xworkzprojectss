package com.xworkz.interfaces.interface1.Drill;

public class DrillImpl implements Drill {
    public void bore() {
        System.out.println("bore called");
    }
    public void reverse() {
        System.out.println("reverse called");
    }
    public void stop() {
        System.out.println("stop called");
    }
    public static void main(String[] args) {
        Drill obj = new DrillImpl();
        obj.bore();
        obj.reverse();
        obj.stop();
    }
}
