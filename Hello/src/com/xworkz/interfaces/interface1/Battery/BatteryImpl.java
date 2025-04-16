package com.xworkz.interfaces.interface1.Battery;

public class BatteryImpl implements Battery {
    public void charge() {
        System.out.println("charge called");
    }
    public void discharge() {
        System.out.println("discharge called");
    }
    public void recycle() {
        System.out.println("recycle called");
    }
    public static void main(String[] args) {
        Battery obj = new BatteryImpl();
        obj.charge();
        obj.discharge();
        obj.recycle();
    }
}
