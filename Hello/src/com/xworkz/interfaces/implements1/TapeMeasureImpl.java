package com.xworkz.interfaces.implements1;

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
    public void preserve() {
        System.out.println("Preserving food at low temperature...");
    }
}
