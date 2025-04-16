package com.xworkz.interfaces.interface1;

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

}
