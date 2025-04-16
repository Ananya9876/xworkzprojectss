package com.xworkz.interfaces.interface1;

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

}
