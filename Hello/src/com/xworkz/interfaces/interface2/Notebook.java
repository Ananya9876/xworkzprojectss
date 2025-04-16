package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Charger;
import com.xworkz.interfaces.interfaceclass.Chassis;

public class Notebook implements Charger, Chassis {
    public void connect() {
        System.out.println("connect called");
    }
    public void power() {
        System.out.println("power called");
    }
    public void disconnect() {
        System.out.println("disconnect called");
    }
    public void mount() {
        System.out.println("mount called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void align() {
        System.out.println("align called");
    }

}
