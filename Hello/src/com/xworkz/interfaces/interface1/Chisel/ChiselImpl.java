package com.xworkz.interfaces.interface1.Chisel;

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
    public static void main(String[] args) {
        Chisel obj = new ChiselImpl();
        obj.carve();
        obj.chip();
        obj.shape();
    }
}
