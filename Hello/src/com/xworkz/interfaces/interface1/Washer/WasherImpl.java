package com.xworkz.interfaces.interface1.Washer;

public class WasherImpl implements Washer {
    public void cushion() {
        System.out.println("cushion called");
    }
    public void space() {
        System.out.println("space called");
    }
    public void seal() {
        System.out.println("seal called");
    }
    public static void main(String[] args) {
        Washer obj = new WasherImpl();
        obj.cushion();
        obj.space();
        obj.seal();
    }
}
