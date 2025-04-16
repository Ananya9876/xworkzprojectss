package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.TapeMeasure;

public class TapeMeasureImpl implements TapeMeasure {
    public void extend() {
        System.out.println("extend called");
    }
    public void retract() {
        System.out.println("retract called");
    }
    public void read() {
        System.out.println("read called");
    }

}
