package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Instrument;

public class InstrumentImpl implements Instrument {
    public void play() {
        System.out.println("play called");
    }
    public void tune() {
        System.out.println("tune called");
    }
    public void clean() {
        System.out.println("clean called");
    }

    public void measure() {
        System.out.println("Measuring of the instrument...");
    }
}
