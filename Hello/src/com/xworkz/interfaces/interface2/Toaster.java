package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Equipment;
import com.xworkz.interfaces.interfaceclass.Fan;

public class Toaster implements Equipment, Fan {
    public void blow() {
        System.out.println("blow called");
    }
    public void oscillate() {
        System.out.println("oscillate called");
    }
    public void cool() {
        System.out.println("cool called");
    }
    public void install() {
        System.out.println("install called");
    }
    public void uninstall() {
        System.out.println("uninstall called");
    }
    public void update() {
        System.out.println("update called");
    }

}
