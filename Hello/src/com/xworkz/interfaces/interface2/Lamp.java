package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Compass;
import com.xworkz.interfaces.interfaceclass.Component;

public class Lamp implements Compass, Component {
    public void draw() {
        System.out.println("draw called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void measure() {
        System.out.println("measure called");
    }
    public void fit() {
        System.out.println("fit called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void test() {
        System.out.println("test called");
    }


}
