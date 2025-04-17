package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Plane;

public class PlaneImpl implements Plane {
    public void shave() {
        System.out.println("shave called");
    }
    public void level() {
        System.out.println("level called");
    }
    public void finish() {
        System.out.println("finish called");
    }
    public void clean() {
        System.out.println("Plane is clean...");
    }
}
