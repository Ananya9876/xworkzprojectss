package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Battery;

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

}
