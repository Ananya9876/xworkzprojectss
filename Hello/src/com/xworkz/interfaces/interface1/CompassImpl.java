package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Compass;

public class CompassImpl implements Compass {
    public void draw() {
        System.out.println("draw called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void measure() {
        System.out.println("measure called");
    }

}
