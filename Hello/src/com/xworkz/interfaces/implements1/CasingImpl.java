package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Casing;

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

    public void open() {
        System.out.println("Opening of the case.");
    }
}
