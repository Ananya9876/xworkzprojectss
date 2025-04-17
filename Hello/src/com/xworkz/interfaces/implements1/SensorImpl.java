package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Sensor;

public class SensorImpl implements Sensor {
    public void detect() {
        System.out.println("detect called");
    }
    public void measure() {
        System.out.println("measure called");
    }
    public void alert() {
        System.out.println("alert called");
    }
    public void color() {
        System.out.println("Red in color...");
    }
}
