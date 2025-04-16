package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Level;
import com.xworkz.interfaces.interfaceclass.Lever;

public class Cableclip implements Level, Lever {
    public void measure() {
        System.out.println("measure called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void indicate() {
        System.out.println("indicate called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void push() {
        System.out.println("push called");
    }
    public void lock() {
        System.out.println("lock called");
    }

}
