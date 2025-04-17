package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Nail;

public class NailImpl implements Nail {
    public void drive() {
        System.out.println("drive called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void color() {
        System.out.println("coloring of the nails...");
    }
}
