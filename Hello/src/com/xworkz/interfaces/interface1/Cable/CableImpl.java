package com.xworkz.interfaces.interface1.Cable;

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
    public static void main(String[] args) {
        Cable obj = new CableImpl();
        obj.plugIn();
        obj.transmit();
        obj.unplug();
    }
}
