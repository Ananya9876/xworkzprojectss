package com.xworkz.interfaces.interface1.Wheel;

public class WheelImpl implements Wheel {
    public void spin() {
        System.out.println("spin called");
    }
    public void stop() {
        System.out.println("stop called");
    }
    public void align() {
        System.out.println("align called");
    }
    public static void main(String[] args) {
        Wheel obj = new WheelImpl();
        obj.spin();
        obj.stop();
        obj.align();
    }
}
