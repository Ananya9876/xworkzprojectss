package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Seal;

public class SealImpl implements Seal {
    public void compress() {
        System.out.println("compress called");
    }
    public void stretch() {
        System.out.println("stretch called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void measure() {
        System.out.println("Measurement of the seal");
    }
}
