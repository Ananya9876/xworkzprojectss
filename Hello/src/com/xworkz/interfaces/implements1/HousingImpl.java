package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Housing;

public class HousingImpl implements Housing {
    public void surround() {
        System.out.println("surround called");
    }
    public void protect() {
        System.out.println("protect called");
    }
    public void vent() {
        System.out.println("vent called");
    }

    public void floor() {
        System.out.println("Floor is build..");
    }
}
