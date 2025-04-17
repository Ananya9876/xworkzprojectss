package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Valve;

public class ValveImpl implements Valve {
    public void open() {
        System.out.println("open called");
    }
    public void close() {
        System.out.println("close called");
    }
    public void regulate() {
        System.out.println("regulate called");
    }
    public void clean() {
        System.out.println("Cleaning the floor...");
    }
}
