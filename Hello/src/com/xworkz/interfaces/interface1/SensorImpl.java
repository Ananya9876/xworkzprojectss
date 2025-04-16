package com.xworkz.interfaces.interface1;

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

}
