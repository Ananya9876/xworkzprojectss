package com.xworkz.interfaces.interface1;

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

}
