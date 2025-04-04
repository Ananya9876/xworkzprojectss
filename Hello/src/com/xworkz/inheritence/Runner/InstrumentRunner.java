package com.xworkz.inheritence.Runner;


import com.xworkz.inheritence.internal.instrument.Guitar;
import com.xworkz.inheritence.internal.instrument.Instrument;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument instrument=new Guitar();
        instrument.play();
        instrument.sound();
        instrument.type();
        instrument.maintenance();
        instrument.brand();

        System.out.println("-----------");

        Guitar guitar=new Guitar();
        guitar.play();
        guitar.sound();
        guitar.type();
        guitar.maintenance();
        guitar.brand();
    }
}
