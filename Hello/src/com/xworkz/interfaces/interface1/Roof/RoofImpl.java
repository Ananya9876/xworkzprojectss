package com.xworkz.interfaces.interface1.Roof;

public class RoofImpl implements Roof {
    public void cover() {
        System.out.println("cover called");
    }
    public void drain() {
        System.out.println("drain called");
    }
    public void ventilate() {
        System.out.println("ventilate called");
    }
    public static void main(String[] args) {
        Roof obj = new RoofImpl();
        obj.cover();
        obj.drain();
        obj.ventilate();
    }
}
