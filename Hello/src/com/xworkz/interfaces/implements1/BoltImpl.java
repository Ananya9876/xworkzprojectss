package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Bolt;

public class BoltImpl implements Bolt {
    public void secure() {
        System.out.println("secure called");
    }
    public void unscrew() {
        System.out.println("unscrew called");
    }
    public void fasten() {
        System.out.println("fasten called");
    }

    public void slower() {
        System.out.println("Slowing of the bolt.");
    }
}
