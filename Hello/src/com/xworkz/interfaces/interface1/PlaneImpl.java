package com.xworkz.interfaces.interface1;

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

}
