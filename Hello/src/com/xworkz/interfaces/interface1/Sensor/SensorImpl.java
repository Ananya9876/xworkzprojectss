package com.xworkz.interfaces.interface1.Sensor;

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
    public static void main(String[] args) {
        Sensor obj = new SensorImpl();
        obj.detect();
        obj.measure();
        obj.alert();
    }
}
