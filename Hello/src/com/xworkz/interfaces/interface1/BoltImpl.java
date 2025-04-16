package com.xworkz.interfaces.interface1;

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

}
