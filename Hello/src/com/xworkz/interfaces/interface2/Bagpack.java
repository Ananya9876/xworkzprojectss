package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Blade;
import com.xworkz.interfaces.interfaceclass.Bolt;

public class Bagpack implements Blade, Bolt {
    public void cut() {
        System.out.println("cut called");
    }
    public void sharpen() {
        System.out.println("sharpen called");
    }
    public void store() {
        System.out.println("store called");
    }
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
