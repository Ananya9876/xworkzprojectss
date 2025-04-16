package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Lock;
import com.xworkz.interfaces.interfaceclass.Machine;

public class Sockat implements Lock, Machine {
    public void secure() {
        System.out.println("secure called");
    }
    public void open() {
        System.out.println("open called");
    }
    public void jam() {
        System.out.println("jam called");
    }
    public void operate() {
        System.out.println("operate called");
    }
    public void shutDown() {
        System.out.println("shutDown called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }


}
