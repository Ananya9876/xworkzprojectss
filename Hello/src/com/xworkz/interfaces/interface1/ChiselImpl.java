package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Chisel;

public class ChiselImpl implements Chisel {
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
