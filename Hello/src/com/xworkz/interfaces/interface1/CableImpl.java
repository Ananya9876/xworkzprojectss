package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Cable;

public class CableImpl implements Cable {
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
