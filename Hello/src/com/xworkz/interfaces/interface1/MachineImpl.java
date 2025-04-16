package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Machine;

public class MachineImpl implements Machine {
    public void operate() {
        System.out.println("operate called");
    }
    public void shutDown() {
        System.out.println("shutDown called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }

}
