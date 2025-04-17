package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Roof;

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
    public void shield() {
        System.out.println("Shield...");
    }
}
