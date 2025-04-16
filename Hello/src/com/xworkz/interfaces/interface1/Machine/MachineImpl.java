package com.xworkz.interfaces.interface1.Machine;

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
    public static void main(String[] args) {
        Machine obj = new MachineImpl();
        obj.operate();
        obj.shutDown();
        obj.calibrate();
    }
}
