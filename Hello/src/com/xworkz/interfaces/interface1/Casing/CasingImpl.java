package com.xworkz.interfaces.interface1.Casing;

public class CasingImpl implements Casing {
    public void enclose() {
        System.out.println("enclose called");
    }
    public void shield() {
        System.out.println("shield called");
    }
    public void label() {
        System.out.println("label called");
    }
    public static void main(String[] args) {
        Casing obj = new CasingImpl();
        obj.enclose();
        obj.shield();
        obj.label();
    }
}
