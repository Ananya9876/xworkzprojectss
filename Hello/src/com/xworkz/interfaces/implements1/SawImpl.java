package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Saw;

public class SawImpl implements Saw {
    public void cut() {
        System.out.println("cut called");
    }
    public void guide() {
        System.out.println("guide called");
    }
    public void rest() {
        System.out.println("rest called");
    }
    public void see() {
        System.out.println("Seeing of the saw...");
    }
}
