package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Drill;
import com.xworkz.interfaces.interfaceclass.Engine;

public class Trolly implements Drill, Engine {
    public void ignite() {
        System.out.println("ignite called");
    }
    public void throttle() {
        System.out.println("throttle called");
    }
    public void idle() {
        System.out.println("idle called");
    }
    public void bore() {
        System.out.println("bore called");
    }
    public void reverse() {
        System.out.println("reverse called");
    }
    public void stop() {
        System.out.println("stop called");
    }

}
