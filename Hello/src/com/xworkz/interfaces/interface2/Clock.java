package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Module;
import com.xworkz.interfaces.interfaceclass.Motor;

public class Clock implements Module, Motor {
    public void integrate() {
        System.out.println("integrate called");
    }
    public void isolate() {
        System.out.println("isolate called");
    }
    public void test() {
        System.out.println("test called");
    }
    public void run() {
        System.out.println("run called");
    }
    public void speedUp() {
        System.out.println("speedUp called");
    }
    public void slowDown() {
        System.out.println("slowDown called");
    }

}
