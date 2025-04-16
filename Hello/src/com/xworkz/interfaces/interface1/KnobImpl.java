package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Knob;

public class KnobImpl implements Knob {
    public void rotate() {
        System.out.println("rotate called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }

}
