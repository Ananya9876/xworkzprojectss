package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Hose;
import com.xworkz.interfaces.interfaceclass.Housing;

public class Fan implements Hose, Housing {
    public void connect() {
        System.out.println("connect called");
    }
    public void flow() {
        System.out.println("flow called");
    }
    public void disconnect() {
        System.out.println("disconnect called");
    }
    public void surround() {
        System.out.println("surround called");
    }
    public void protect() {
        System.out.println("protect called");
    }
    public void vent() {
        System.out.println("vent called");
    }

}
