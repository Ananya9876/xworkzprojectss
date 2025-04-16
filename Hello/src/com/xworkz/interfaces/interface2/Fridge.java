package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Instrument;
import com.xworkz.interfaces.interfaceclass.Knob;

public class Fridge implements Instrument, Knob {
    public void play() {
        System.out.println("play called");
    }
    public void tune() {
        System.out.println("tune called");
    }
    public void clean() {
        System.out.println("clean called");
    }
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
