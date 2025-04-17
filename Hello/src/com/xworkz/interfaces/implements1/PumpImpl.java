package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Pump;

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
    public void repair() {
        System.out.println("Water pumping..");
    }
}
