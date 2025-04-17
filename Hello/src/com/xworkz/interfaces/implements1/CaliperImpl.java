package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Caliper;

public class CaliperImpl implements Caliper {
    public void measure() {
        System.out.println("measure called");
    }
    public void read() {
        System.out.println("read called");
    }
    public void reset() {
        System.out.println("reset called");
    }

    public void write() {
        System.out.println("Writing...");
    }
}
