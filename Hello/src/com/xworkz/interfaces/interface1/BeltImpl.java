package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Belt;

public class BeltImpl implements Belt {
    public void tension() {
        System.out.println("tension called");
    }
    public void move() {
        System.out.println("move called");
    }
    public void slip() {
        System.out.println("slip called");
    }

}
