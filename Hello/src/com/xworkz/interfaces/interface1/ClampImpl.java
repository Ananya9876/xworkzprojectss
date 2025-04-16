package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Clamp;

public class ClampImpl implements Clamp {
    public void fix() {
        System.out.println("fix called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void lock() {
        System.out.println("lock called");
    }

}
