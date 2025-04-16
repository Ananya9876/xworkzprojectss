package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Chisel;
import com.xworkz.interfaces.interfaceclass.Clamp;

public class Pen implements Chisel, Clamp {
    public void fix() {
        System.out.println("fix called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void lock() {
        System.out.println("lock called");
    }
    public void carve() {
        System.out.println("carve called");
    }
    public void chip() {
        System.out.println("chip called");
    }
    public void shape() {
        System.out.println("shape called");
    }


}
