package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Gear;
import com.xworkz.interfaces.interfaceclass.Hammer;

public class Table implements Gear, Hammer {
    public void rotate() {
        System.out.println("rotate called");
    }
    public void interlock() {
        System.out.println("interlock called");
    }
    public void transfer() {
        System.out.println("transfer called");
    }
    public void hit() {
        System.out.println("hit called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void tap() {
        System.out.println("tap called");
    }

}
