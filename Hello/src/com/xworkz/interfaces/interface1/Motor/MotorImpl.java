package com.xworkz.interfaces.interface1.Motor;

public class MotorImpl implements Motor {
    public void run() {
        System.out.println("run called");
    }
    public void speedUp() {
        System.out.println("speedUp called");
    }
    public void slowDown() {
        System.out.println("slowDown called");
    }
    public static void main(String[] args) {
        Motor obj = new MotorImpl();
        obj.run();
        obj.speedUp();
        obj.slowDown();
    }
}
