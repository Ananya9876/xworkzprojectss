package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Actuator;

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

}
