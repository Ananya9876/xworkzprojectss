package com.xworkz.interfaces.interface1.Instrument;

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
    public static void main(String[] args) {
        Instrument obj = new InstrumentImpl();
        obj.play();
        obj.tune();
        obj.clean();
    }
}
