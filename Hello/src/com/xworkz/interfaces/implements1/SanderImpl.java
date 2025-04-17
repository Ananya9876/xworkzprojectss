package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Sander;

public class SanderImpl implements Sander {
    public void smooth() {
        System.out.println("smooth called");
    }
    public void finish() {
        System.out.println("finish called");
    }
    public void clean() {
        System.out.println("clean called");
    }

    public void shine() {
        System.out.println("Shining of the sander...");
    }
}
