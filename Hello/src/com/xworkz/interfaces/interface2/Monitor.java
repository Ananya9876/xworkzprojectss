package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Accessory;
import com.xworkz.interfaces.interfaceclass.Actuator;

public class Monitor implements Accessory, Actuator {
    public void attach() {
        System.out.println("attach called");
    }
    public void detach() {
        System.out.println("detach called");
    }
    public void clean() {
        System.out.println("clean called");
    }
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
