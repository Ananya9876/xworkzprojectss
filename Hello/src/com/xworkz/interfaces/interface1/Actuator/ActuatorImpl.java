package com.xworkz.interfaces.interface1.Actuator;

public class ActuatorImpl implements Actuator {
    public void engage() {
        System.out.println("engage called");
    }
    public void disengage() {
        System.out.println("disengage called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }
    public static void main(String[] args) {
        Actuator obj = new ActuatorImpl();
        obj.engage();
        obj.disengage();
        obj.calibrate();
    }
}
