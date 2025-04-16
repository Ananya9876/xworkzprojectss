package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Button;
import com.xworkz.interfaces.interfaceclass.Cable;

public class Thermostat implements Button, Cable {
    public void press() {
        System.out.println("press called");
    }
    public void release() {
        System.out.println("release called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public void plugIn() {
        System.out.println("plugIn called");
    }
    public void transmit() {
        System.out.println("transmit called");
    }
    public void unplug() {
        System.out.println("unplug called");
    }

}
