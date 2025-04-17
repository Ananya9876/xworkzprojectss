package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.AppliancePart;

public class AppliancePartImpl implements AppliancePart {
    public void insert() {
        System.out.println("insert called");
    }
    public void eject() {
        System.out.println("eject called");
    }
    public void inspect() {
        System.out.println("inspect called");
    }

    public void remove() {
        System.out.println("Remove the appliance part.");
    }
}
