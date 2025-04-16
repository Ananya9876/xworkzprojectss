package com.xworkz.interfaces.interface1.Pump;

public class PumpImpl implements Pump {
    public void suction() {
        System.out.println("suction called");
    }
    public void pressure() {
        System.out.println("pressure called");
    }
    public void stop() {
        System.out.println("stop called");
    }
    public static void main(String[] args) {
        Pump obj = new PumpImpl();
        obj.suction();
        obj.pressure();
        obj.stop();
    }
}
