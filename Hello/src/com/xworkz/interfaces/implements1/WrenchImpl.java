package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Wrench;

public class WrenchImpl implements Wrench {
    public void twist() {
        System.out.println("twist called");
    }
    public void turn() {
        System.out.println("turn called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void use() {
        System.out.println("Using of the wrench");
    }
}
