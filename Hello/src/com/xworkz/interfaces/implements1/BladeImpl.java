package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Blade;

public class BladeImpl implements Blade {
    public void cut() {
        System.out.println("cut called");
    }
    public void sharpen() {
        System.out.println("sharpen called");
    }
    public void store() {
        System.out.println("store called");
    }

    public void shape() {
        System.out.println("Rectangular shape...");
    }
}
